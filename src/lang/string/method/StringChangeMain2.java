package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming   ";

        System.out.println(strWithSpaces.toLowerCase());
        System.out.println(strWithSpaces.toUpperCase());

        System.out.println(strWithSpaces.trim());
        System.out.println(strWithSpaces.strip()); // 유니코드 공백까지 제거해줌
    }
}
