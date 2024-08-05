package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain4 {
    public static void hello(Process process) {
        System.out.println("start");
        process.run();
        System.out.println("end");
    }


    public static void main(String[] args) {
        // 익명 클래스 활용
        hello(new Process() {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);

            }
        });

        hello(new Process() {

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}

// 자바8부터는 메서드를 인수로 전달 가능하게 되었음: 람다