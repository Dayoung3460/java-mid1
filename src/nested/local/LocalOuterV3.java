package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceValue = 3;

    public Printer process(int paramVar) {
        // 지역 변수
        // effectively final = 사실상 final
        // 지역 클래스에서 접근하고 있는 지역 변수는 final이여야 햠.
         int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                // localVar, paramVar 는 지역 변수기 때문에 process() 끝나면 제거됨
                // 이 맞지만 LocalPrinter 인스턴스를 생성할 때 지역 클래스가 접근하는 지역 변수를 확인함.
                // localVar, paramVar를 복사해서 인스턴스에 포함 시켜버림.
                // localVar, paramVar는 스택 영역에서 가져오는게 아님.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                // LocalOuterV3 인스턴스가 생성되면서 얘의 참조값을 가지고 있기 때문에 outInstanceValue에 접근 가능
                System.out.println("outInstanceValue = " + outInstanceValue);

            }
        }

        // 지역 클래스로 만든 객체도 인스턴스이기 때문에 힙 영역에 존재.
        LocalPrinter printer = new LocalPrinter();
//        localPrinter.print();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        // 인스턴스가 반환되면서 여기서도 사용되기 때문에 main 메서드가 끝날 때까지 GC 안되고 살아있음
        Printer printer = localOuterV1.process(2);
        // process 의 스택 프레임이 사라진 이후에 실행
        // process()가 끝나면서 process 메서드 및 그 안의 지역 변수 모두 사라진 상태
        // 하지만 printer.print()를 실행하면서 process의 지역 변수인 localVar, paramVar에 접근을 시도하고 있음.
        // 근데 오류 안나고 실행 잠됨. localVar, paramVar에 접근이 가능함 ???
        // 지역 변수 캡쳐로 가능 -> 지역 클래스의 인스턴스를 생성하는 시점에 필요한 지역 변수를 복사해서 생성한 인스턴스와 함께 넣어둠.
        // 모든 지역 변수를 캡처하는 것이 아니라 접근이 필요한 지역 변수만.
        printer.print();

        System.out.println();
        System.out.println("========Fields=========");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            // 필드 4개가 출력됨
            // 1. value: 본인 인스턴스 변수
            // 2. localVar: 지역 변수 캡쳐로 인해서 가지고 있던 필드
            // 3. paramVar: 지역 변수 캡쳐로 인해서 가지고 있던 필드
            // 4. LocalOuterV3$1LocalPrinter.this$0: printer는 내부 클래스이므로 외부 클래스를 참조하기 위한 필드.
            // 2 ~ 4는 자바가 내부에서 만들어 사용하는 필드들. final임
            System.out.println(declaredField);
        }
    }
}


// 1. 클래스 변수: = static 변수, 프로그램 종료 까지 생존. 가장 김(메서드 영역)
// 2. 인스턴스 변수: 인스턴스의 생존 기간(힙 영역). GC 되지 전까지 존재
// 3. 지역 변수: 메서드 호출이 끝나면 사라짐(스택 영역). 스택 영역 안의 스택 프레임 안에 존재. 메서드가 종료되면 스택 프레임이 제거되면서 그 안에 있는 지역 변수 모두 제거됨. 매개변수도 지역 변수의 한 종류