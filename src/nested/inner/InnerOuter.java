package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // InnerOuter 클래스의 인스턴스 멤버가 됨
    class Inner {
        private int innerInstance = 1;

        public void print() {
            System.out.println(innerInstance);

            System.out.println(outInstanceValue);

            System.out.println(outClassValue);
        }
    }
}
