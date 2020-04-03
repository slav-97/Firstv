package by.tut.lect30;

import java.time.format.DateTimeParseException;

public class DateApi {
    public static void main(String[] args) {
        DateU.getFixedDateFormatted();
        DateU.getPlusThreeMonths();
        DateU.getDateFormatted();

        String stringDate = "26-03-2014";
        try {
            DateU.getLocalDateFromString(stringDate);
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты");
            e.printStackTrace();
        }

        DateU.getPeriodOfDates();
        DateU.getDurationOfDates();
        int addDays = 42;
        AddDays addTodayDays = new AddDays(addDays);
        addTodayDays.setNewDate();
        SetDateNextFJ changeDate = new SetDateNextFJ();
        changeDate.setNewDate();
    }
}


