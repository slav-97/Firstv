package by.tut.lect19;

import java.util.Random;

public enum RobotPart {
    HEAD, BODY, LEFT_ARM, RIGHT_ARM, LEFT_LEG, RIGHT_LEG, RAM, CPU, HDD;

    public static RobotPart getRandomPart() {
        Random random = new Random();
        RobotPart[] availableParts = RobotPart.values();
        return availableParts[random.nextInt(availableParts.length)];
    }
}
