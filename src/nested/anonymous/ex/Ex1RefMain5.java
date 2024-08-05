package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain5 {
    public static void hello(Process process) {
        System.out.println("start");
        process.run();
        System.out.println("end");
    }


    public static void main(String[] args) {
        // 메서드 코드 블럭을 직접 전달
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);

        });

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}