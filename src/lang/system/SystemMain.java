package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);

        long nanoTime = System.nanoTime();
        System.out.println(nanoTime);

        // 시스템(운영체제) 환경변수 호출
        System.out.println(System.getenv());

        // 자바가 사용하는 시스템 속상
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        // 루프로 돌려서 복사하는게 아니고 운영체제 단에서 한번에 복사하는거라 아주 빠름
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println(copiedArray);
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // program 중료
        // 가급적 사용하지 말기
    }
}
