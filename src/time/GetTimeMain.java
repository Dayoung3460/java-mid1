package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("year: " + dt.get(ChronoField.YEAR));
        System.out.println("Month of year: " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR OF DAY: " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("minute of hour: " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND OF MINUTE: " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("year: " + dt.getYear());
        System.out.println("Month of year: " + dt.getDayOfMonth());
        System.out.println("HOUR OF DAY: " + dt.getHour());
        System.out.println("minute of hour: " + dt.getMinute());
        System.out.println("SECOND OF MINUTE: " + dt.getSecond());

        System.out.println("편의 메서드 없음");
        System.out.println("minute of day: " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("second of day: " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
