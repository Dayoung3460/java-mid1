package lang.immutable.address;

public class RefAddress2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("Seoul");
        ImmutableAddress b = a; // 객체의 공유 참조는 막을 수 없음.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("Busan");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
