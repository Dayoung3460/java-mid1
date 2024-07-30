package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime localTime = LocalTime.of(9, 10, 30);
        System.out.println(now);
        System.out.println(localTime);

        LocalTime ofTimePlus = localTime.plusSeconds(30);
        System.out.println(ofTimePlus);
    }
}
