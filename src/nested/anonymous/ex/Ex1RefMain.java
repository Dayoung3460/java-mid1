package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {
    // 파라미터로 메서드를 전달할 수 없음.
    // 그래서 인터페이스를 만들고 인터페이스 안의 메서드를 활용
    public static void hello(Process process) {
        System.out.println("start");
        process.run();
        System.out.println("end");
    }

    static class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);

        }
    }

    static class Sum implements Process {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }


    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }
}
