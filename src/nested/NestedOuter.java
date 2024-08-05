package nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 정적 중첩 클래스
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버 접근 불가
//            System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에 접근 가능
            // private 이여도 해당 클래스 안에서 접근하는거기 때문에 가능
            System.out.println(outClassValue);
        }
    }

}
