package by.tut.lect30;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateU {
    public static void getFixedDateFormatted() {
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd.MM.yyyy"));
        System.out.println("Фиксированная дата: " + fixedDate.format(formatter));
    }

    public static void getPlusThreeMonths() {
        LocalDate today = LocalDate.now();
        LocalDate todayPlusMonths = today.plus(3, ChronoUnit.MONTHS);
        System.out.println("Local date today: " + today);
        System.out.println("Local date plus 3 months: " + todayPlusMonths);
    }

    public static void getDateFormatted() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Сегодня дата отформатирована: " + today.format(formatter));
    }

    public static void getLocalDateFromString(String stringDate) throws DateTimeParseException {
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Parsed date from string:" + parsedDate);
    }

    public static void getPeriodOfDates() {
        LocalDate today = LocalDate.now();
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);
        Period periodOfDates = Period.between(today, fixedDate);
        int days = periodOfDates.getDays();
        int months = periodOfDates.getMonths();
        int years = periodOfDates.getYears();

        if (years == 0 && months == 0 && days == 0) {
            System.out.println("Периоды равны");
        } else if (years == 0) {
            System.out.println("Период между " + today + " и " + fixedDate + " : " +
                    months + " месяцы " + days + " дни");
        } else if (months == 0) {
            System.out.println("Период между " + today + " и " + fixedDate + " : " + years + " годы " +
                    days + " дни");
        } else if (days == 0) {
            System.out.println("Период между " + today + " и " + fixedDate + " : " + years + " годы " +
                    months + " месяцы");
        } else {
            System.out.println("Период между " + today + " и " + fixedDate + " : " + years + " годы " +
                    months + " месяцы " + days + " дни");
        }
    }

    public static void getDurationOfDates() {
        LocalDate today = LocalDate.now();
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);
        LocalDateTime todayMidnight = today.atStartOfDay();
        LocalDateTime fixedDateMidnight = fixedDate.atStartOfDay();
        Duration durationOfDates = Duration.between(todayMidnight, fixedDateMidnight);
        System.out.println("Продолжительность между " + today + " полночью и " +
                fixedDate + " полночью : " + durationOfDates.toSeconds() + " секунды");
    }
}
