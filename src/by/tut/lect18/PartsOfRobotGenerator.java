package by.tut.lect18;

import java.util.concurrent.ThreadLocalRandom;

public class PartsOfRobotGenerator {
    public PartsOfRobot[] getArrayOFParts(int size) {
        PartsOfRobot[] parts = PartsOfRobot.values();
        PartsOfRobot[] result = new PartsOfRobot[size];

        for (int i = 0; i < size; i++) {
            int randomPart = ThreadLocalRandom.current().nextInt(0, parts.length);
            result[i] = parts[randomPart];
        }
        return result;
    }

    public PartsOfRobot getRandomPart() {
        PartsOfRobot[] parts = PartsOfRobot.values();
        return parts[ThreadLocalRandom.current().nextInt(0, parts.length)];
    }
}

