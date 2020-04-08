package by.tut.lect18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Phaser;

 // Объект TaskBuilder конфигурирует потоки учёных, слуг и свалки в соответствии с полученными параметрами,
 // создаёт указанное кол-во потоков и производит обмен ссылками на общие ресурсы между потоками.
 // В рамках одного TaskBuilder создаётся только один объект свалки, который используют все слуги.

public class TaskBuilder {
    private final byte DUMP_START_CAPACITY = 20;

    private int scientCounter = 1;  // счётчик созданных потоков MadScient
    private int numberOfScients;
    private int days;
    private Phaser phaser;  // синхронизатор доступа на свалку
    private int dayDuration;

    public TaskBuilder(int numberOfScients, int days, int dayDuration) {
        this.numberOfScients = numberOfScients;
        this.phaser = new Phaser(numberOfScients + 1);
        this.days = days;
        this.dayDuration = dayDuration;
    }

    private MadScient newMadScient() {
        MadScient scient =  new MadScient(newServant(), days, newFromServantToScientistExchanger());
        scient.setName("MadScient-" + scientCounter);
        scientCounter++;
        return scient;
    }

    private Servant newServant() {
        Servant servant = new Servant();
        servant.setDaemon(true);
        return servant;
    }

    private PartsOfRobotGenerator newFactoryDump() {
        PartsOfRobotGenerator partsOfRobotGenerator =  new PartsOfRobotGenerator(
                days,
                new ArrayList<PartsOfRobot>(DUMP_START_CAPACITY),
                phaser,
                dayDuration
        );
        partsOfRobotGenerator.setDaemon(true);
        return partsOfRobotGenerator;
    }
     // Создаёт объект Exchanger для передачи собранных деталей от помощника учёному.
    private Exchanger<List<PartsOfRobot>> newFromServantToScientistExchanger() {
        return new Exchanger<>();
    }
     // Обмен ссылками на общие ресурсы.
    private void synchronization(PartsOfRobotGenerator robotGenerator, MadScient scientist) {
        // привязка слуги к свалке
        scientist.getServant().setDump(robotGenerator);
        // привязка слуги к синхронизатору доступа на свалку
        scientist.getServant().setPhaser(robotGenerator);
    }

    public void runTask() {
        PartsOfRobotGenerator partsOfRobotGenerator = newFactoryDump();

        MadScient[] scients = new MadScient[numberOfScients];
        for (int i = 0; i < numberOfScients; i++) {
            scients[i] = newMadScient();
            synchronization(partsOfRobotGenerator, scients[i]);
        }
        // старт всех созданных потоков
        partsOfRobotGenerator.start();
        for (MadScient scient : scients) scient.start();
    }
}
