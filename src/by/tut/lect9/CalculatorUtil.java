package by.tut.lect9;

import java.math.BigDecimal;

public class CalculatorUtil {
    public static <T extends Number> Number sum01(Calculator<T> argsGenericType) {

        T arg01 = argsGenericType.getValue01();
        T arg02 = argsGenericType.getValue02();

        Number result = null;

        if (arg01 instanceof Integer) {
            result = (Integer) (arg01.intValue() + arg02.intValue());
        } else if (arg01 instanceof Double) {
            result = (Double) (arg01.doubleValue() + arg02.doubleValue());
        } else if (arg01 instanceof Float) {
            result = (Float) (arg01.floatValue() + arg02.floatValue());
        } else if (arg01 instanceof BigDecimal) {
            result = (BigDecimal) ((BigDecimal) arg01).add((BigDecimal) arg02);
        }
        return result;
    }

    public static <T extends Number> Number div01(Calculator<T> argsGenericType) {

        T arg01 = argsGenericType.getValue01();
        T arg02 = argsGenericType.getValue02();
        Number result = null;

        if (arg01 instanceof Integer) {
            result = (Integer) (arg01.intValue() / arg02.intValue());
        } else if (arg01 instanceof Double) {
            result = (Double) (arg01.doubleValue() / arg02.doubleValue());
        } else if (arg01 instanceof Float) {
            result = (Float) (arg01.floatValue() / arg02.floatValue());
        } else if (arg01 instanceof BigDecimal) {
            result = (BigDecimal) ((BigDecimal) arg01).divide((BigDecimal) arg02);
        }
        return result;
    }
}
