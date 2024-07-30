package time;

import java.time.Instant;
import java.time.ZonedDateTime;

// Epoch(에포크) 시간 = Unix timestamp
// 기계중심 시간
// UTC 기준 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 초 단위로 표현
// Instant는 에포크 시간 다루는 클래스
// UTC를 기준으로 하므로 시간대에 영향받지 않음. 전세계에서 동일한 시점을 가리킬 때 유용
// 순수 시간의 흐름을 다루고 싶을 때 사용
public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        // zoned time을 UTC로 변환
        // from(): 타임존 정보가 필요하기 때문에 LocalDateTime 같은애들은 사용불가
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        long epochSecond = later.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);
    }
    
}
