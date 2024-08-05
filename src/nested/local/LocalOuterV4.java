package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceValue = 3;

    public Printer process(int paramVar) {
         int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceValue);

            }
        }

        LocalPrinter printer = new LocalPrinter();
        // 캡처된 지역 변수 값 변경 불가.
        // 스택 영역에 존재하는 지역 변수와 인스턴스에 캡처한 캡처 변수의 값이 서로 달라짐
        // '동기화 문제' 발생.
//        localVar = 10;

        // 값을 변경하고 싶으면 차라리 새로 변수 만들어.
        int newLocalVar = localVar;
        newLocalVar = 10;
        System.out.println(newLocalVar);

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer printer = localOuterV1.process(2);
        printer.print();

        System.out.println();
        System.out.println("========Fields=========");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }
}