package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        // 단순 문자열을 합칠 때는 String으로 '+' 연산하면되는데
        // 루프를 돌리거나 조건문을 통해 동적으로 문자열 조합할 때는 StringBuilder가 훨씬 빠름
        // 루프 뭐 몇십번 도는 정도는 String 써도 괜춘ㅎ
        for(int i = 0; i < 100000; i++) {
            result.append("Hello Java ");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
