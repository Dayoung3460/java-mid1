package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void helloDice() {

        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("randomValue = " + randomValue);
    }

    public static void helloSum() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void hello(String str) {
        System.out.println("start");
        if(str.equals("Dice")) {
            helloDice();
        } else if(str.equals("Sum")){
            helloSum();
        } else {
            System.out.println("str = " + str);
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        hello("Dice");
        hello("Sum");
    }
}
