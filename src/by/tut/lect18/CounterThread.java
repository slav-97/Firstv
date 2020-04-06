package by.tut.lect18;

import java.util.concurrent.atomic.AtomicLong;

public class CounterThread extends Thread{
    private AtomicLong sum;

    public CounterThread(AtomicLong sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 10_000_001; i++) {
                if (i % 1_000_000 == 0) Thread.sleep(10);
                if (i%2 == 0 && i%3 == 0) sum.getAndAdd(i);
            }
        } catch (InterruptedException exc) {

        }
    }
}
