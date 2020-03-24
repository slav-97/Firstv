package by.tut.lect9;

import java.math.BigDecimal;

public class Generics {
    public static void main(String[] args) {
        Pair<String, String> initialPair = new Pair<>("1111key", "2222Value");

        System.out.println("Pair K before " + initialPair.getKey());
        System.out.println("Pair V before " + initialPair.getValue());

        Pair swappedPair = PairUtil.swap(initialPair);

        System.out.println("Pair K after " + swappedPair.getKey());
        System.out.println("Pair V after " + swappedPair.getValue());

        Calculator<Integer> varInteger = new Calculator<>(20, 10);
        Number sum01Result = CalculatorUtil.sum01(varInteger);
        Number div01Result = CalculatorUtil.div01(varInteger);
        System.out.println("Integer sum " + varInteger.getValue01() + " + " + varInteger.getValue02() + " = " + sum01Result);
        System.out.println("Integer div " + varInteger.getValue01() + " / " + varInteger.getValue02() + " = " + div01Result);


        Calculator<Double> varDouble = new Calculator<>(10.34D, 24D);
        Number sum02Result = CalculatorUtil.sum01(varDouble);
        Number div02Result = CalculatorUtil.div01(varDouble);
        System.out.println("Double sum " + varDouble.getValue01() + " + " + varDouble.getValue02() + " = " + sum02Result);
        System.out.println("Double div " + varDouble.getValue01() + " / " + varDouble.getValue02() + " = " + div02Result);


        Calculator<Float> varFloat = new Calculator<>(147.3f, 203.3f);
        Number sum03Result = CalculatorUtil.sum01(varFloat);
        Number div03Result = CalculatorUtil.div01(varFloat);
        System.out.println("Float sum " + varFloat.getValue01() + " + " + varFloat.getValue02() + " = " + sum03Result);
        System.out.println("Float div " + varFloat.getValue01() + " / " + varFloat.getValue02() + " = " + div03Result);

        BigDecimal bigDecimalNumber01 = new BigDecimal("111111");
        BigDecimal bigDecimalNumber02 = new BigDecimal("222222");
        Calculator<BigDecimal> varBigDecimal = new Calculator<>(bigDecimalNumber01, bigDecimalNumber02);
        Number sum04Result = CalculatorUtil.sum01(varBigDecimal);
        Number div04Result = CalculatorUtil.div01(varBigDecimal);
        System.out.println("BigDecimal sum " + varBigDecimal.getValue01() + " + " + varBigDecimal.getValue02() + " = " + sum04Result);
        System.out.println("BigDecimal div " + varBigDecimal.getValue01() + " / " + varBigDecimal.getValue02() + " = " + div04Result);

        Calculator<Double> calculator = new Calculator(12.5, 15.5);

        ClassAnalyzer.analizeClass(calculator);

        ClassAnalyzer.transactionSuccessVerification(calculator);
    }
}
