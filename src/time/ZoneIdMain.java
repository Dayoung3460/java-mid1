package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId.getRules());
        }

        // 운영체제에서 선택된 날짜 기반으로
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println(seoulZoneId);
    }
}
