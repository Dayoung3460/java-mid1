package lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object o = new Object();
        String string = o.toString();

        // 같은 값 출력됨
        // println() 안에 lang.object.toString() 호출하는 부분이 있음.
        // -> println() 사용할 때 lang.object.toString() 직접 호출할 필요 없이 객체를 바로 전달하면 객체 정보 출력 가능
        System.out.println(o);
        System.out.println(string);
    }
}
