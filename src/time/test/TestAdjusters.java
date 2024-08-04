package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1);
        System.out.println(localDate.getDayOfWeek());
        LocalDate dayOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(dayOfWeek.getDayOfWeek());
    }
}
