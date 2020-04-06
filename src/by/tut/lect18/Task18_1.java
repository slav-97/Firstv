package by.tut.lect18;

import java.util.concurrent.atomic.AtomicLong;

 // Создать поток, который будет в цикле итерироваться от 1 до 10_000_000 и суммировать каждый четный элемент
 // кратный 3. На каждой итерации, кратной 1_000_000, поток должен заснуть на 10 мс.
 // Вместе с суммирующим потоком запустить поток-демон, который каждую пятую миллисекунду выводит в консоль
 // текущее значение просуммированных элементов.

public class Task18_1 {
    public static void main(String[] args) {
        AtomicLong sum = new AtomicLong(0L);
        CounterDaemon counterDaemon = new CounterDaemon(sum);
        counterDaemon.setDaemon(true);
        new CounterThread(sum).start();
        counterDaemon.start();
    }
}
