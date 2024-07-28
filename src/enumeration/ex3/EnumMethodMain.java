package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        System.out.println(Arrays.toString(values));

        for (Grade value : values) {
            System.out.println(value.name());
            // 0 부터 시작
            // 이 함수는 사용 지양하기
            // 상수 선언하는 위치가 변경회면 전체 상수의 위치가 변경될 수 있기 때문
            System.out.println(value.ordinal());
        }

        String input = "GOLD";
        // String -> ENUM 변환
        Grade gold = Grade.valueOf(input);
        System.out.println(gold);
    }
}
