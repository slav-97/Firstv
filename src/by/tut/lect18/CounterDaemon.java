package by.tut.lect18;

import java.util.concurrent.atomic.AtomicLong;

public class CounterDaemon extends Thread{
    private AtomicLong sum;

    public CounterDaemon(AtomicLong sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(5);
                System.out.println(sum.get());
            }
        } catch (InterruptedException exc) {

        }
    }
}
