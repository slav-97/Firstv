package by.tut.lect19;

import java.util.*;
import java.util.stream.IntStream;

public class Dump {
    private static final int INITIAL_SIZE = 20;
    private static final int MIN_GENERATED = 1;
    private static final int MAX_GENERATED = 4;

    private final Random random = new Random();

    private final List<RobotPart> robotParts;

    public Dump() {
        robotParts = new ArrayList<>();
        generateParts(INITIAL_SIZE);
    }

    public void generateParts() {
        generateParts(MIN_GENERATED + random.nextInt(MAX_GENERATED));
    }

    private void generateParts(int number) {
        IntStream.range(0, number).forEach($ -> robotParts.add(RobotPart.getRandomPart()));
    }

    public synchronized List<RobotPart> giveParts(int numberParts) {
        if (robotParts.isEmpty()) {
            return Collections.emptyList();
        }
        int numberPartsToIssue = numberParts > robotParts.size() ? robotParts.size() : numberParts;
        List<RobotPart> partsToIssue = new ArrayList<>();
        IntStream.range(0, numberPartsToIssue).forEach(
                $ -> partsToIssue.add(robotParts.remove(random.nextInt(robotParts.size()))));
        return partsToIssue;
    }
}
