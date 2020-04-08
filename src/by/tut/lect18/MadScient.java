package by.tut.lect18;

import java.util.*;
import java.util.concurrent.Exchanger;

 // Поток MadScient получает детали от помощника в течении поределенного кол-ва дней, после чего
 // подсчитывает собранных роботов, выводит результат в консоль и завершает работу
 // вместе с потоками Servant и PartsOfRobotGenerator.

public class MadScient extends Thread{
    private Map<PartsOfRobot, Integer> collectedParts = new HashMap<>(PartsOfRobot.values().length);
    private Exchanger<List<PartsOfRobot>> fromServantToScient;
    private int days;
    private Servant servant;

    protected MadScient(Servant servant, int days, Exchanger<List<PartsOfRobot>> fromServantToScient) {
        this.servant = servant;
        this.days = days;
        this.fromServantToScient = fromServantToScient;
        this.servant.setExchanger(this);
    }

    @Override
    public void run() {
        servant.start();

        List<PartsOfRobot> parts;
        try {
            for (int day = 1; day <= days; day++) {
                parts = fromServantToScient.exchange(null);
                parts.forEach(this::putValuesInMap);
                ResultGenerator.showCurrentResult(parts, day, Thread.currentThread().getName());
            }
            ResultGenerator.showTotalResult(countAssembledRobots(), collectedParts, Thread.currentThread().getName());
        } catch (InterruptedException exc) {
            // TODO
        }
    }
     // Помещает полученные от помощника детали в Map.
    private void putValuesInMap(PartsOfRobot part) {
        if (collectedParts.containsKey(part)) collectedParts.put(part, collectedParts.get(part) + 1);
        else collectedParts.put(part, 1);
    }
     // Возвращает кол-во собранных роботов, равное минимальному значению в collectedParts. <br>
     // Если collectedParts.size() < 9, то значит некоторые детали отсутствуют и метод вернет 0.
    private int countAssembledRobots() {
        return collectedParts.size() == 9
                ? this.collectedParts.values().stream().min(Comparator.naturalOrder()).get()
                : 0;
    }

    protected Exchanger<List<PartsOfRobot>> getExchanger() {
        return fromServantToScient;
    }

    protected Servant getServant() {
        return servant;
    }
}
