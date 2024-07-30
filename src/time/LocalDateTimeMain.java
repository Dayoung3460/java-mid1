package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println(nowDt);
        System.out.println(ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println(ofDtPlus);
        LocalDateTime ofDtPlusYear = ofDt.plusYears(1);
        System.out.println(ofDtPlusYear);

        System.out.println(nowDt.isBefore(ofDt));
        System.out.println(nowDt.isAfter(ofDt));
        // isEqual(): 객체 다르고 타임존이 달라도 시간적으로 같으면 true 반환.
        // ex) Seoul 9시 isEqual(UTC 0시) -> true
        // equals(): 객체 타입, 타임존 등 내부 데이터의 모든 구성요소가 같아야 true 반환
        // Seoul 9시 equals(UTC 0시) -> false. 타임존의 데이터가 다름
        System.out.println(nowDt.isEqual(ofDt));

    }
}
