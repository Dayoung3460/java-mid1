package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("Seoul");

        MemberV2 memberA = new MemberV2("memberA", address);
        MemberV2 memberB = new MemberV2("memberB", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.setImmutableAddress(new ImmutableAddress("Busan"));
        System.out.println("Busan -> memberB.address");
        System.out.println("mamberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
