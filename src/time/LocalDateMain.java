package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2023, 11, 21);
        System.out.println(nowDate);
        System.out.println(ofDate);

        // 불변 객체이기 때문에 반환값 받아서 할당해줘야함
        ofDate = ofDate.plusDays(10);
        System.out.println(ofDate);
    }
}
