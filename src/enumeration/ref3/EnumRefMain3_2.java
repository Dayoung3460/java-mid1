package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        System.out.println(Grade.BASIC.discount(price));
        System.out.println(Grade.GOLD.discount(price));
        System.out.println(Grade.DIAMOND.discount(price));
    }
}
