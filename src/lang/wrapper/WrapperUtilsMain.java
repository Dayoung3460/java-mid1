package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        // 문자열을 래퍼 객체로 변환해줌
        Integer i2 = Integer.valueOf("10");
        // 문자열 전용 메서드. 기본형을 반환
        int intValue = Integer.parseInt("10");

        int compareResult = i1.compareTo(20);
        System.out.println(compareResult);

        System.out.println(Integer.sum(10, 20));
        System.out.println(Integer.min(10, 20));
        System.out.println(Integer.max(10, 20));

    }
}
