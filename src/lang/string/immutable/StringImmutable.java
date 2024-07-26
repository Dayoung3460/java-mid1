package lang.string.immutable;

public class StringImmutable {
    public static void main(String[] args) {
        // String은 불변객체. 변경이 필요한 경우 기존 값 변경하지 않고 새로운 값 만들어서 반환.
        // 문자열 풀에 들어있는 스트링 인스턴스의 값을 변경해버리면 같은 인스턴스를 참조하고 있는 변수의 값까지 변경됨. 이 사이드 이펙트를 막기 위해 String은 불변객체로 설계되었음
        String str = "hello";
        String newStr = str.concat(" java");
        System.out.println("str = " + newStr);
    }

}
