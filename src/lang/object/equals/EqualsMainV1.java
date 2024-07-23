package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        // "==": 참조값이 같은지, 완전히 같은 값인지 체크(identity check: 동일성 비교)
        System.out.println("identity = " + (user1 == user2));
        // Object가 기본으로 제공하는 equals()는 "==" 과 같음.
        // equals()를 오버라이딩해서 논리적으로 같은 값인지 체크해야함(equality check: 동등성 비교)
        // 예) 주민등록번호가 같은 유저인지, 연락처가 같은 유저인지, 회원 번호가 같은 유저인지 각각의 클래스마다 동등성 처리가 다름
        System.out.println("equality = " + (user1.equals(user2)));

    }
}
