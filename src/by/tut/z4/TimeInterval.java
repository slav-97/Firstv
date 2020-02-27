package by.tut.z4;

public class TimeInterval {
    private int hours;
    private int minutes;
    private int seconds;

    public static void main(String[] args) {
        TimeInterval obj1 = new TimeInterval(12578);
        TimeInterval obj2 = new TimeInterval(15,20,36);
        obj1.printAllTime();
        obj2.printDividedTime();
    }
    public TimeInterval(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public TimeInterval(int allsec) {
        seconds = allsec;
    }

    public int returnAllSecond() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public void printAllTime() {
        System.out.println("Object1 \\(only seconds\\) = " + seconds);
    }

    public void printDividedTime() {
        System.out.println(String.format("Object2 have %s hours, %s minuts, %s seconds", hours, minutes, seconds));
    }
}
