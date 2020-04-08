package by.tut.lect18;

import java.util.List;
import java.util.concurrent.*;

 // Поток PartsOfRobotGenerator каждый день генерирует случайные детали, которые затем собирают потоки Servant.
 // Если происходит выброс деталей (генерация), то слуги ждут у входа на свалку, после чего они
 // в случайном порядке заходят на свалку.
 // Единовременно на свалке может быть только 1 слуга.
 // При создании поток PartsOfRobotGenerator помечается как демон.
 // PartsOfRobotGenerator существует в единственном экземпляре в рамках одного TaskBuilder.

public class PartsOfRobotGenerator extends Thread {
    private final byte FIRST_DAY = 1;
    private final int FIRST_DAY_PARTS = 20;
    private final int OTHER_DAYS_PARTS_FROM = 1;
    private final int OTHER_DAYS_PARTS_TO = 4;
    private PartsOfRobot[] parts = PartsOfRobot.values();
    private int dayDuration;
    int days;
    private List<PartsOfRobot> dump;
    private Phaser phaser;

    protected PartsOfRobotGenerator(int days, List<PartsOfRobot> dump, Phaser phaser, int dayDuration) {
        this.days = days;
        this.dump = dump;
        this.phaser = phaser;
        this.dayDuration = dayDuration;
    }

    @Override
    public void run() {
        try {
            int day = FIRST_DAY;
            while (true) {
                phaser.arriveAndAwaitAdvance();
                synchronized (dump) {
                    generateParts(day);
                }
                day++;
                Thread.sleep(dayDuration);
            }
        } catch (InterruptedException exc) {
            // TODO
        }
    }

    private void generateParts(int day) {
        if (day > FIRST_DAY) {
            int count = ThreadLocalRandom.current().nextInt(OTHER_DAYS_PARTS_FROM, OTHER_DAYS_PARTS_TO + 1);
            for (int i = 0; i < count; i++) {
                dump.add(randomPart());
            }
        }
        else {
            for (int i = 0; i < FIRST_DAY_PARTS; i++) {
                dump.add(randomPart());
            }
        }
    }
     // Генерирует случайную деталь робота.
    private PartsOfRobot randomPart() {
        return parts[ThreadLocalRandom.current().nextInt(0, parts.length)];
    }

    protected List<PartsOfRobot> getDump() {
        return dump;
    }

    protected Phaser getPhaser() {
        return phaser;
    }
}
