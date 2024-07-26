package lang.string.eqauls;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("method calling comparison1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("method calling comparison: " + isSame(str3, str4));
    }

    // String 타입의 값을 매개변수로 가져올 때 x, y가 String 객체로 넘어오는지 리터럴 문자열로 넘어오는지 알 수가 없어
    // 문자열 비교할 때는 항상 equals()를 사용하는 것이 안전함
    private static boolean isSame(String x, String y) {
//        return x == y;
        return x.equals(y);
    }
}
