package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 익명 클래스: 지역 클래스의 종류. 이름이 없음.
        // 클래스의 선언(정의), 생성 한 번에 처리
        // new {상속 또는 구현할 부모 타입}
        // new Printer(): 인터페이스인 Printer를 생성하는 것 같지만 인터페이스는 인스턴스 생성 불가.
        // Printer 인터페이스를 구현한 익명 클래스를 생성하는 것임.
        // 익명 클래스는 부모 클래스를 상속 받거나 인터페이스를 구현해야만 함. 상위 클래스 또는 인터페이스 필요.
        // 기본 생성자만 사용됨.

        // 익명 클래스 장점: 코드 간결.
        // 단점: 클래스 정의, 생성 동시에 하기 때문에 익명 클래스 딱 한 번만 생성 가능.
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceValue);

            }
        };

        printer.print();
        // 익명 클래스는 이름이 없으니 $1, 두개면 $2 이런식으로 출력됨
        System.out.println(printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.process(2);
    }
}
