package by.tut.lect5;

import java.math.BigDecimal;

class OverloadOfMethods {

    int sumOverload(int intNumberA, int intNumberB) {
        int result = 0;
        result = intNumberA + intNumberB;

        return result;
    }

    double sumOverload(double doubleNumberA, double doubleNumberB) {
        double result = 0;
        result = doubleNumberA + doubleNumberB;

        return result;
    }

    BigDecimal sumOverload(BigDecimal bigDecimalNumberA, BigDecimal bigDecimalNumberB) {
        BigDecimal result = null;
        result = bigDecimalNumberA.add(bigDecimalNumberB);

        return result;

    }
}

public class Busya03 {
    public static void main(String[] args) {

        int intNumberA = 30;
        int intNumberB = 150;
        double doubleNumberA = 20.5;
        double doubleNumberB = 30285.75;

        int resultIntNumbers = 0;
        double resultDoubleNumbers = 0;
        BigDecimal resultBigDecimalNumbers = null;

        BigDecimal bigDecimalNumberA = new BigDecimal("11111.12");
        BigDecimal bigDecimalNumberB = new BigDecimal("22222.1234");

        OverloadOfMethods overloadObj = new OverloadOfMethods();

        resultIntNumbers = overloadObj.sumOverload(intNumberA, intNumberB);
        System.out.println("Sum of " + intNumberA + " + " + intNumberB + " = "
                + resultIntNumbers);

        resultDoubleNumbers = overloadObj.sumOverload(doubleNumberA, doubleNumberB);
        System.out.println("Sum of " + doubleNumberA + " + " + doubleNumberB + " = "
                + resultDoubleNumbers);

        resultBigDecimalNumbers = overloadObj.sumOverload(bigDecimalNumberA, bigDecimalNumberB);
        System.out.println("Sum of " + bigDecimalNumberA + " + " + bigDecimalNumberB + " = "
                + resultBigDecimalNumbers);

    }
}
