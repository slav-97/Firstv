package by.tut.lect13;

public class Task13_7 {
    public static String func(int i) {
        return String.format("%010d", i);
    }

    public static String func2(int i) {
        String number = Long.toString(i + 10000000000L);
        return number.substring(number.length() - 10);
    }

    public static String func3(int i) {
        StringBuilder number = new StringBuilder("0000000000").append(i);
        return number.substring(number.length() - 10);
    }

    public static void main(String[] args) {
        System.out.println(func(22));
        System.out.println(func2(22));
        System.out.println(func3(22));
    }
}
