package by.tut.lect5;

import java.math.BigDecimal;

class argument {

    private int a1;
    private int a2;
    private double b1;
    private double b2;

    public static int sum(int a1, int a2) {
        return a1 + a2;
    }

    public static double sum(double b1, double b2) {
        return b1 + b2;
    }

    public static BigDecimal BigDecimalsum(int a1, int a2) {
        return (new BigDecimal(a1).add(new BigDecimal(a2)));
    }

    public static BigDecimal BigDecimalsum(double b1, double b2) { BigDecimal now = new BigDecimal(b1);
        BigDecimal now1 = new BigDecimal(b2);
        return now.add(now1);
    }
}

public class Busya03 {
    public static void main(String[] args) {
        System.out.println(argument.sum(0.2, 0.2));
        System.out.println(argument.BigDecimalsum(1111.12, 1212.2343));

    }
}
