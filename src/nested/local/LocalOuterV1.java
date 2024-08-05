package nested.local;

public class LocalOuterV1 {
    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 지역 클래스
        // 지역 클래스는 private 불가
        // 지역 변수가 private 못 쓰는 것 처럼
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceValue);

            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
