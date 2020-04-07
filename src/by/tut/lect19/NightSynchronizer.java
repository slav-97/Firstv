package by.tut.lect19;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class NightSynchronizer {
    private CyclicBarrier barrier = new CyclicBarrier(3);
    private AtomicInteger currentNight = new AtomicInteger(1);
    private static final int NUMBER_NIGHTS = 100;

    public void waitForNight() {
        try {
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nextNight() {
        this.currentNight.incrementAndGet();
        waitForNight();
    }

    public boolean isLastNight() {
        return currentNight.get() == NUMBER_NIGHTS;
    }
}
