package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        //서울 2024년 1월 1일 오전 9시
        // 런던, 뉴욕 시간 구하기
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId newYorkZone = ZoneId.of("America/New_York");

        LocalDateTime seoulLocalTime = LocalDateTime.of(2024, 1, 1, 9, 0);
        ZonedDateTime seoulTime = ZonedDateTime.of(seoulLocalTime, seoulZone);
        ZonedDateTime londonTime = ZonedDateTime.of(seoulLocalTime, seoulZone).withZoneSameInstant(londonZone);
        ZonedDateTime newYorkTime = ZonedDateTime.of(seoulLocalTime, seoulZone).withZoneSameInstant(newYorkZone);

        System.out.println(seoulTime);
        System.out.println(londonTime);
        System.out.println(newYorkTime);
    }
}
