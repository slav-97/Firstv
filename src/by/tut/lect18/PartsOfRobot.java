package by.tut.lect18;

public enum PartsOfRobot {
    HEAD("Голова"),
    BODY("Тело"),
    LEFT_HAND("Левая рука"),
    RIGHT_HAND("Правая рука"),
    LEFT_FOOT("Левая нога"),
    RIGHT_FOOT("Правая нога"),
    CPU("CPU"),
    RAM("RAM"),
    HDD("HDD");

    private String value;

    PartsOfRobot(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
