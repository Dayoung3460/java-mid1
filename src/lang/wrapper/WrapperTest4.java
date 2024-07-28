package lang.wrapper;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        Integer num = Integer.valueOf(str);
        System.out.println("Integer1: " + num);

        int value = num;
        System.out.println("intValue: " + value);

        Integer integer2 = value;
        System.out.println("integer2: " + integer2);

    }
}
