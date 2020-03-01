package by.tut.z4;

public class TimeInterval {
    public static void main(String[] args) {
        TimeLength timeOne = new TimeLength("One", 12, 24, 32);
        TimeLength timeTwo = new TimeLength("Two", 32, 78, 123);
        TimeLength timeThree = new TimeLength("Three", 32000);

        printTimeLength(timeOne);
        printTimeLength(timeTwo);
        printTimeLength(timeThree);

    }

    public static void printTimeLength(TimeLength time) {
        System.out.println("Name [" + time.getName() + "]:");
        System.out.println("time =    " + time);
        System.out.println("seconds = " + time.getShareSeconds());
    }
}

class TimeLength {
    private String name;
    private int hours;
    private int minutes;
    private int seconds;

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public TimeLength(String name, int hours, int minutes, int seconds) {
        this.name = name;
        this.hours = Math.abs(hours) % 24;
        this.minutes = Math.abs(minutes) % 60;
        this.seconds = Math.abs(seconds) % 60;
    }

    public TimeLength(String name, int seconds) {
        this.name = name;
        convertSecondsToTime(seconds);
    }

    public int getShareSeconds() {
        return this.hours * 3600 + this.minutes * 60 + seconds;
    }

    private void convertSecondsToTime(int seconds) {
        seconds = Math.abs(seconds);
        this.hours = seconds / 3600 % 24;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    @Override
    public String toString() {
        return String.format("%d h. %d m. %d s", this.hours, this.minutes, this.seconds);
    }
}

