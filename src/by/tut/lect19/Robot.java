package by.tut.lect19;

import java.util.*;
import java.util.stream.Collectors;

public class Robot {
    public static Integer build(Collection<RobotPart> parts) {
        final Map<RobotPart, Integer> robotMap = new HashMap<>();

        parts.forEach(part -> {
            if (robotMap.containsKey(part)) {
                robotMap.put(part, robotMap.get(part) + 1);
            } else {
                robotMap.put(part, 1);
            }
        });
        List<Map.Entry<RobotPart, Integer>> entries = robotMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        return entries.size() == RobotPart.values().length ? entries.get(0).getValue() : 0;
    }
}
