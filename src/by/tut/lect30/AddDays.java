package by.tut.lect30;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AddDays  implements TemporalAdjuster {
    private int addDays;

    public int getAddDays() {
        return addDays;
    }

    public void setAddDays(int addDays) {
        this.addDays = addDays;
    }

    @Override
    public void setNewDate() {
        setAddDays(addDays);
        LocalDate today = LocalDate.now();
        LocalDate todayPlusDays = today.plus(this.addDays, ChronoUnit.DAYS);
        System.out.println("Сегодня " + today);
        System.out.println("Сегодня плюс " + this.addDays + " дни : " + todayPlusDays);
        System.out.println();
    }

    AddDays(int addDays) {
        this.addDays = addDays;
    }
}
