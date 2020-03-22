package by.tut.lect9;

import java.math.BigDecimal;

public class Generics {
    public static void main(String[] args) {

        Pair<String, String> initialPair = new Pair<>("12", "1212Value");

        System.out.println("Pair K before " + initialPair.getKey());
        System.out.println("Pair V before " + initialPair.getValue());

        Pair swappedPair = PairUtil.swap(initialPair);

        System.out.println("Pair K after " + swappedPair.getKey());
        System.out.println("Pair V after " + swappedPair.getValue());

        Calculator<Integer> varInteger = new Calculator<>(20, 10);
        Number sumAB01Result = CalculatorUtil.sum01(varInteger);
        Number divAB01Result = CalculatorUtil.div01(varInteger);
        System.out.println("Integer sum " + varInteger.getValue01() + " + " + varInteger.getValue02() + " = " + sumAB01Result);
        System.out.println("Integer div " + varInteger.getValue01() + " / " + varInteger.getValue02() + " = " + divAB01Result);


        Calculator<Double> varDouble = new Calculator<>(10.34D, 24D);
        Number sumAB02Result = CalculatorUtil.sum01(varDouble);
        Number divAB02Result = CalculatorUtil.div01(varDouble);
        System.out.println("Double sum " + varDouble.getValue01() + " + " + varDouble.getValue02() + " = " + sumAB02Result);
        System.out.println("Double div " + varDouble.getValue01() + " / " + varDouble.getValue02() + " = " + divAB02Result);


        Calculator<Float> varFloat = new Calculator<>(147.3f, 203.3f);
        Number sumAB03Result = CalculatorUtil.sum01(varFloat);
        Number divAB03Result = CalculatorUtil.div01(varFloat);
        System.out.println("Float sum " + varFloat.getValue01() + " + " + varFloat.getValue02() + " = " + sumAB03Result);
        System.out.println("Float div " + varFloat.getValue01() + " / " + varFloat.getValue02() + " = " + divAB03Result);

        BigDecimal bigDecimalNumber01 = new BigDecimal("111111");
        BigDecimal bigDecimalNumber02 = new BigDecimal("222222");
        Calculator<BigDecimal> varBigDecimal = new Calculator<>(bigDecimalNumber01, bigDecimalNumber02);
        Number sumAB04Result = CalculatorUtil.sum01(varBigDecimal);
        Number divAB04Result = CalculatorUtil.div01(varBigDecimal);
        System.out.println("BigDecimal sum " + varBigDecimal.getValue01() + " + " + varBigDecimal.getValue02() + " = " + sumAB04Result);
        System.out.println("BigDecimal div " + varBigDecimal.getValue01() + " / " + varBigDecimal.getValue02() + " = " + divAB04Result);

    }

}
