package nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        // 정적 중첩 클래스는 외부클래스 인스턴스를 만들고 거기서 접근 가능
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
