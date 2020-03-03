package by.tut.z4;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public static void main(String[] args) {
        Time time = new Time(2, 15, 15);
        System.out.println(time);
    }
    public Time(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
        System.out.println("3");
    }

    public Time(String str) {
        this(Integer.valueOf(str));
        System.out.println("1");
    }

    public Time(int allSeconds) {
        int sec = (allSeconds % 3600) % 60;
        int hour = (allSeconds / 3600);
        int minut = (allSeconds % 3600) / 60;
        this.seconds = sec;
        this.hours = hour;
        this.minutes = minut;
        System.out.println("2");
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
