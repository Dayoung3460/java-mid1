package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id=100");
        UserV2 user2 = new UserV2("id=100");

        System.out.println("identity: " + (user1 == user2));
        // id가 같은 유저인지 확인
        System.out.println("equality: " + (user1.equals(user2)));
    }
}
