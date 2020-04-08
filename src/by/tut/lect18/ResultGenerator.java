package by.tut.lect18;

import java.util.List;
import java.util.Map;

public class ResultGenerator {
     // Показывает полученные от помощника детали.
    protected synchronized static void showCurrentResult(List<PartsOfRobot> parts, int day, String threadName) {
        System.out.println(">>> День " + day + " [" + threadName + "]");
        parts.forEach(System.out::println);
        System.out.println("____________________________");
    }
     // Показывает кол-во собранных роботов и общее кол-во собранных деталей.
    protected synchronized static void showTotalResult(
            int assembledRobots,
            Map<PartsOfRobot, Integer> collectedParts,
            String threadName
    ) {
        System.out.println("----------------------------");
        System.out.println("ИТОГ");
        System.out.println(threadName);
        System.out.println("Собрано роботов: " + assembledRobots);
        System.out.println("Общее кол-во деталей:");
        collectedParts.entrySet().forEach(System.out::println);
        System.out.println("----------------------------");
    }
}
