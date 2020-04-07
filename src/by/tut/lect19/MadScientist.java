package by.tut.lect19;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MadScientist implements Callable<Integer>{
    private Dump dump;
    private NightSynchronizer nightSynchronizer;
    private AssistantScientist assistant;

    public MadScientist(Dump dump, NightSynchronizer nightSynchronizer, AssistantScientist assistant) {
        this.dump = dump;
        this.nightSynchronizer = nightSynchronizer;
        this.assistant = assistant;
    }

    @Override
    public Integer call() {
        List<RobotPart> collectedParts = new ArrayList<>();
        while (true) {
            nightSynchronizer.waitForNight();
            collectedParts.addAll(dump.giveParts(assistant.howManyPartsToPickUp()));
            if (nightSynchronizer.isLastNight()) {
                return Robot.build(collectedParts);
            }
        }
    }
}
