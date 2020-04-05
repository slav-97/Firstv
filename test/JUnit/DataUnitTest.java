package JUnit;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DataUnitTest {
    @Test
    public void getFixedDateFormattedTest() {
        LocalDate fixedDate = LocalDate.of(2020, 6, 25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd.MM.yyyy"));
        Assert.assertEquals(fixedDate.format(formatter), "25.06.2020");
    }

    @Test
    public void getPlusThreeMonthsTest() {
        LocalDate today = LocalDate.of(2020, 4, 3);
        LocalDate todayPlusMonths = today.plus(3, ChronoUnit.MONTHS);
        String actual = todayPlusMonths.toString();
        Assert.assertEquals("2020-07-03", actual);
    }

    @Test
    public void getDateFormattedTest() {
        LocalDate today = LocalDate.of(2020, 4, 3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String actual = today.format(formatter);
        Assert.assertEquals("03.04.2020", actual);
    }

    @Test
    public void getLocalDateFromStringTest() {
        String dateFromString = "26-03-2014";
        LocalDate parsedDate = LocalDate.parse(dateFromString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Assert.assertEquals("26-03-2014", parsedDate.format(formatter));
    }

    @Test(expected = DateTimeParseException.class)
    public void getLocalDateFromStringTestException01() {
        //Text '26-03-21222' could not be parsed at index 6
        String stringDate = "26-03-23331222"; // Correct is  format "dd-MM-yyyy"
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Test(expected = DateTimeParseException.class)
    public void getLocalDateFromStringTestException02() {
        String stringDate = "99-03-2014";
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Test(expected = DateTimeParseException.class)
    public void getLocalDateFromStringTestException03() {
        String stringDate = "26-23-2014";
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Test
    public void getPeriodOfDatesTest() {
        LocalDate today = LocalDate.of(2020, 6, 25);
        LocalDate fixedDate = LocalDate.of(2020, 6, 30);
        long daysBetweenDates = ChronoUnit.DAYS.between(today, fixedDate);
        Assert.assertEquals(5, daysBetweenDates);
    }

    @Test
    public void getDurationOfDatesTest() {
        LocalDate today = LocalDate.of(2020, 6, 25);
        LocalDate fixedDate = LocalDate.of(2020, 6, 26);
        LocalDateTime todayMidnight = today.atStartOfDay();
        LocalDateTime fixedDateMidnight = fixedDate.atStartOfDay();
        Duration durationOfDates = Duration.between(todayMidnight, fixedDateMidnight);
        Assert.assertEquals(86400, durationOfDates.getSeconds());
    }

    @Test
    public void setNewDateTestClassAddDaysTest() {
        LocalDate today = LocalDate.of(2020, 6, 25);
        LocalDate todayPlusDays = today.plus(3, ChronoUnit.DAYS);
        Assert.assertEquals("2020-06-28", todayPlusDays.toString());
    }

    @Test
    public void setNewDateClassSetDateNextFJTest() {
        LocalDate today = LocalDate.of(2020, 12, 29);
        int daysInYear = today.lengthOfYear();
        int todayIsDay = today.getDayOfYear();
        int leftDays = daysInYear - todayIsDay;
        LocalDate newDate = today.plus(leftDays + 1, ChronoUnit.DAYS);
        Assert.assertEquals(3, leftDays + 1);
    }
}
