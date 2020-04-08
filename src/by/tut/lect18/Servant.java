package by.tut.lect18;

import java.util.*;
import java.util.concurrent.*;

 // Поток Servant собирает детали на свалке и передаёт их учёному. Если на свалке нет деталей, или
 // если слуга пришёл на свалку до выброса деталей, то учёный не получает ничего и помощник возвращается
 // на свалку на следующий день.
 // При создании поток Servant помечается как демон.

public class Servant extends Thread{
    private final int PARTS_COUNTER_FROM = 1;
    private final int PARTS_COUNTER_TO = 4;
    private Exchanger<List<PartsOfRobot>> fromServantToScientist;
    private Phaser phaser;
    private List<PartsOfRobot> dump;

    @Override
    public void run() {
        try {
            while (true) {
                tryCollectParts();
            }
        } catch (InterruptedException exc) {
            // TODO
        }
    }
     // Попытка собрать детали на свалке.
    private void tryCollectParts() throws InterruptedException {
        int numberOfParts = ThreadLocalRandom.current().nextInt(PARTS_COUNTER_FROM, PARTS_COUNTER_TO + 1);
        List<PartsOfRobot> collectedParts = new ArrayList<>(PARTS_COUNTER_TO);

        phaser.arriveAndAwaitAdvance();
        synchronized (dump) {
            if (! dump.isEmpty()) {
                int i = 0;
                while (! dump.isEmpty() && i < numberOfParts) {
                    collectedParts.add(dump.remove(dump.size()-1));
                    i++;
                }
            }
        }
        transferToScient(collectedParts);
    }
     // Передача собранных деталей учёному.
    private void transferToScient(List<PartsOfRobot> collectedParts) throws InterruptedException {
        fromServantToScientist.exchange(collectedParts);
    }

    protected void setExchanger(MadScient scientist) {
        this.fromServantToScientist = scientist.getExchanger();
    }

    protected void setDump(PartsOfRobotGenerator partsOfRobotGenerator) {
        this.dump = partsOfRobotGenerator.getDump();
    }

    protected void setPhaser(PartsOfRobotGenerator partsOfRobotGenerator) {
        this.phaser = partsOfRobotGenerator.getPhaser();
    }
}
