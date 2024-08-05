package nested;

public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            // 쉐도잉: 지역변수의 value 가 우선순위가 높으므로 다른 value 들을 가림
            System.out.println("value: " + value);
            // 자신의 인스턴스의 value
            System.out.println("this.value: " + this.value);
            // 외부 클래스 인스턴스의 value
            System.out.println("ShadowingMain.value: " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();
        inner.go();
    }
}
