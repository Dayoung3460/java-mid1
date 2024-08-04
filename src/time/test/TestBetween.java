package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate);
        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
        System.out.println("Total days: " + totalDays);

    }
}
