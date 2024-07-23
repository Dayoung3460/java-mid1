package lang.immutable.address;

public class RefAddress1_3 {
    public static void main(String[] args) {
        Address a = new Address("Seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "Busan");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("change address -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
