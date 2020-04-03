package by.tut.lect30;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SetDateNextFJ implements TemporalAdjuster {
    @Override
    public void setNewDate() {
        LocalDate today = LocalDate.now();
        int daysInYear = today.lengthOfYear();
        int todayIsDay = today.getDayOfYear();
        int leftDays = daysInYear - todayIsDay + 1;
        System.out.println("Сегодня " + today);
        System.out.println("Существуют " + daysInYear + " дни в этом году");
        System.out.println("Сегодня " + todayIsDay + "день года");
        System.out.println("Осталось " + leftDays + " дней до 01 января следующего года");
        LocalDate newDate = today.plus(leftDays + 1, ChronoUnit.DAYS);
        System.out.println("Изменена дата самого первого января " + newDate);
    }
}
