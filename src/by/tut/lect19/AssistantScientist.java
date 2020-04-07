package by.tut.lect19;

import java.util.Random;

public class AssistantScientist {
    private int minNumberPartsReturned;
    private int maxNumberPartsReturned;

    public AssistantScientist(int minNumberPartsReturned, int maxNumberPartsReturned) {
        this.minNumberPartsReturned = minNumberPartsReturned;
        this.maxNumberPartsReturned = maxNumberPartsReturned;
    }

    public int howManyPartsToPickUp() {
        Random random = new Random();
        return minNumberPartsReturned + random.nextInt(maxNumberPartsReturned);
    }
}
