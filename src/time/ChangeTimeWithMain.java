package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

//        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);
        // 위와 같음
        // 불변객체. year를 변경한 후에 새로운 객체를 반환함
        LocalDateTime changedDt1 = dt.withYear(2020);
        System.out.println("changedDt1 = " + changedDt1);

        // TemporalAdjusters
        // 다가오는 금요일의 날짜
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(dt);
        System.out.println(with1);

        // 이번달 마지막 일요일 날짜
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("with2 = " + with2);
    }
}
