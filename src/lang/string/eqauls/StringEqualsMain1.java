package lang.string.eqauls;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String hello1 = new String("hello");
        String hello2 = new String("hello");

        // 참조값이 다르니까 당연히 false
        System.out.println("new String() == comparison: " + (hello1 == hello2));
        // Object class의 equals method는 '=='의 의미인데 String class 에서는 이미 오버라이딩 해놨음.
        // 단순 문자열의 값 'hello'만 보고 체크함 -> true
        System.out.println("new String() equals comparison: " + (hello1.equals(hello2)));

        // String에 문자열 리터럴 사용하는 경우 자바는 메모리 효율성, 성능 최적화 위해 문자열 풀을 사용함. 힙 영역 사용.
        // 자바 실행되는 시점에 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어둠. 이 때 같은 리터럴 값을 가진 String을 중복해서 인스턴스를 만들지 않음.
        // str3와 str4의 값인 'hello'는 문자열 풀에 하나만 들어가있음
        // 문자열 풀에서 문자 찾을 때는 해쉬 알고리즘 사용. -> 매우 빠름
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("literal == comparison: " + (str3 == str4));
        System.out.println("literal equals comparison: " + (str3.equals(str4)));
    }
}
