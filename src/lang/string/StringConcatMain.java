package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        // 참조형. -> '+'와 같은 연산 사용 불가하지만
        // String class에서는 '+' 기능을 제공해줌
        String result2 = a + b;

        System.out.println(result1);
        System.out.println(result2);
    }
}
