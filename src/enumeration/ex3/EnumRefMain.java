package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println(Grade.BASIC.getClass());
        System.out.println(Grade.GOLD.getClass());
        System.out.println(Grade.DIAMOND.getClass());

        // enum이 상수겂을 그대로 출력하면 상수 문자열이 출력됨. toString() 오버라이딩 해놨음
        System.out.println(Grade.BASIC);

        System.out.println(refValue(Grade.GOLD));
        System.out.println(refValue(Grade.DIAMOND));
    }

    // 참조값을 보고싶을 때
    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
