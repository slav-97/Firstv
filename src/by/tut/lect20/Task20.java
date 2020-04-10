package by.tut.lect20;

// Написать программу, бесконечно считывающую пользовательские числа из консоли.
//        Эти числа представляют собой количество секунд.
//        При каждом вводе числа, должна создаваться задача,
//        которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
//        Однако нужно сделать так, чтобы все задачи выполнялись в одном и
//        том же потоке в порядке ввода.
//        Т.е. в программе есть 2 потока: главный и поток для выполнения всех задач по очереди.
//        При вводе -1 программа должна завершать свою работу.

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

public class Task20 {
    public static boolean run = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService service = Executors.newSingleThreadExecutor();
        while (run) {
            int time = scanner.nextInt();
            if(time == -1){
                service.shutdown();
            }
            service.submit(() -> {
                try {
                    TimeUnit.SECONDS.sleep(time);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println("Я спал для " + time + " секунды");
            });
        }
    }
}
