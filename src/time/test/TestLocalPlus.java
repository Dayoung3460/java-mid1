package time.test;

import java.time.LocalDate;

public class TestLocalPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);

        // 내가 짠거
//        int loop = 1;
//        while(loop <= 5) {
//            System.out.println("date" + loop + ": " + date);
//            date = date.plusWeeks(2);
//            loop++;
//        }

        // 김영한
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = date.plusWeeks(2 * i);
            System.out.println("날짜: " + (i + 1) + ": " + nextDate);
        }
    }
}
