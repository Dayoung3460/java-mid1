package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        // auto boxing
        Integer boxedValue = value;
        // auto unboxing
        int unboxedValue = boxedValue;

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
