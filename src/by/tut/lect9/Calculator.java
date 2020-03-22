package by.tut.lect9;

import java.math.BigDecimal;

public class Calculator<T extends Number> {
    private T value01;
    private T value02;

    Calculator(T value01, T value02) {
        this.value01 = value01;
        this.value02 = value02;
    }

    public T getValue01() {
        return value01;
    }

    public T getValue02() {
        return value02;
    }
}
