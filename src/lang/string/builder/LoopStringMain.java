package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        // 루프를 돌 때 String를 더하는 이런 연산은 자바가 최적화를 해 줄 수 없음
        for(int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        // 3초나 걸렸음
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
