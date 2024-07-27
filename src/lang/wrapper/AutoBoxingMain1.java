package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        int value = 7;
        // boxing
        Integer boxedValue = Integer.valueOf(value);

        // unboxing
        int unboxedValue = boxedValue.intValue();

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
