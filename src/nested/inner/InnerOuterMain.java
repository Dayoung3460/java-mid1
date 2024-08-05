package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter innerOuter = new InnerOuter();
        // 내부 인스턴스는 바깥 인스턴스 안에 생성되어야 함.
        // 실제로는 내부 인스턴스와 바깥 인스턴스가 각각 생성되는데 내부 인스턴스가 바깥 인스턴스의 참조값을 가지고 있음.
        // 이 참조값을 가지고 내부에서 외부 인스턴스 멤버에 접근이 가능한거임
        InnerOuter.Inner inner = innerOuter.new Inner();
        inner.print();

        System.out.println(inner.getClass());

    }
}
