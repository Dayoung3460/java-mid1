package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("Seoul");

        // memberA, memberB 둘 다 같은 참조값의 address를 갖고 있음.
        MemberV1 memberA = new MemberV1("memberA", address);
        MemberV1 memberB = new MemberV1("memberB", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.getAddress().setValue("Busan");
        System.out.println("Busan -> memberB.address");
        System.out.println("mamberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
