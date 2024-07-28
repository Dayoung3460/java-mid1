package lang.math;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generator();

        System.out.println(Arrays.toString(lottoNumbers));
     }
}
