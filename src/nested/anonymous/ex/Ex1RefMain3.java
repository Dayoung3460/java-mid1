package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain3 {
    public static void hello(Process process) {
        System.out.println("start");
        process.run();
        System.out.println("end");
    }


    public static void main(String[] args) {
        Process dice = new Process() {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);

            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }
}
