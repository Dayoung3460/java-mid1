package nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter nestedOuter = new NestedOuter();
        // 바깥 클래스 객체인 nestedOuter 와는 아무 상관이 없음.
        // 그냥 안에 위치해 있을 뿐.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println(nested.getClass());
    }
}
