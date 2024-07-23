package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        // this: user1
        // object: user2
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        // Object타입인 object를 UserV2로 다운캐스팅 해줘야함
        // object에는 id가 없잖니
        UserV2 userV2 = (UserV2) object;

        // String 비교 할 때는 "==" 말고 equals() 사용해아함.
        // why) when you compare two strings using ==, you are actually checking if they reference the same object in memory, not if they have the same sequence of characters.
        // On the other hand, the equals method is used to compare the actual content of the strings. That is, it checks whether the sequence of characters is identical.

//        return id.equals(userV2.id);
        return Objects.equals(id, userV2.id);
    }
}
