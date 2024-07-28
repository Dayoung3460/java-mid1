package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random random = new Random();
        // seed가 같으면 Random의 결과가 같다.
        // 랜덤값을 구할 수 없는데 왜 씨드값 설정?
        // -> 테스트 코드에서 같은 결과값을 얻을 수 있음
        Random random = new Random(2);

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        int randomRange1 = random.nextInt(10); // 0 ~ 9
        System.out.println(randomRange1);

        // 0 ~ 9 랜덤 int에서 + 1
        int randomRange2 = random.nextInt(10) + 1;
        System.out.println(randomRange2);
    }
}
