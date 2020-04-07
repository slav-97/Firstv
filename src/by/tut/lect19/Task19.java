package by.tut.lect19;

import java.util.concurrent.*;

//Двое безумных учёных устроили соревнование, кто из них соберёт больше роботов за 100 ночей. Для этого каждую ночь каждый из них отправляет своего прислужника на свалку фабрики роботов за деталями.
//Чтобы собрать одного робота им нужно:
//Голова, Тело, Левая рука, Правая рука, Левая нога, Правая нога, CPU, RAM, HDD
//В первую ночь на свалке находится 20 случайных деталей. Каждую последующую ночь фабрика выбрасывает на свалку от 1 до 4 случайных деталей.
//В то же самое время прислужники обоих учёных отправляются на свалку, и каждый собирает от 1 до 4 случайных деталей. Если на свалке деталей нет – прислужник уходит ни с чем.
//Затем они возвращаются домой и отдают детали хозяевам.
//Учёные пытаются собрать как можно больше роботов из деталей, которые они получили.
//Написать программу, симулирующую этот процесс. Для симуляции принять, что каждая ночь наступает через 100мс.
//Фабрика и два прислужника действуют в одно и то же время.
//После 100 ночей (около 10 секунд) определить победителя соревнования.

public class Task19 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Dump dump = new Dump();

        NightSynchronizer nightSynchronizer = new NightSynchronizer();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        final MadScientist firstMadScientist = new MadScientist(dump, nightSynchronizer, new AssistantScientist(1, 4));
        final MadScientist secondMadScientist = new MadScientist(dump, nightSynchronizer, new AssistantScientist(1, 4));

        Future<Integer> firstScientistResults = executorService.submit(firstMadScientist);
        Future<Integer> secondScientistResults = executorService.submit(secondMadScientist);

        run(dump, nightSynchronizer);

        executorService.shutdown();

        Integer numberRobotsOfFirstScientist = firstScientistResults.get();
        Integer numberRobotsOfSecondScientist = secondScientistResults.get();
        switch (numberRobotsOfFirstScientist.compareTo(numberRobotsOfSecondScientist)) {
            case -1: {
                System.out.println("Second scientist WON!!!");
                break;
            }
            case 0: {
                System.out.println("Draw.");
            }
            case 1: {
                System.out.println("First scientist WON!!!");
                break;
            }
        }
        System.out.println(" ");
        System.out.println("First scientist collected robots: " + numberRobotsOfFirstScientist);
        System.out.println("Second scientist collected robots: " + numberRobotsOfSecondScientist);

        executorService.awaitTermination(1L, TimeUnit.DAYS);
    }

    private static void run(Dump dump, NightSynchronizer nightSynchronizer) throws InterruptedException {
        do {
            nightSynchronizer.nextNight();
            dump.generateParts();
            Thread.sleep(100);

        } while (!nightSynchronizer.isLastNight());
    }
}
