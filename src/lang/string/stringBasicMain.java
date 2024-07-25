package lang.string;

public class stringBasicMain {
    public static void main(String[] args) {
        // 문자열을 쌍따움표로 감싸면 편의상 자바가 new String("hello") 이런식으로 변경해줌
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 + " " + str2);



    }
}
