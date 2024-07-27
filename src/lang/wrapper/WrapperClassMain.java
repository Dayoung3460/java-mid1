package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        // wrapper class: 기본형을 감싼 클래스. 박싱.불변 객체. 다양한 기능 제공
        Integer newInteger = new Integer(10);

        // 윗줄과 같은 코드.
        // but new Integer()는 deprecated됨
        // Integer.valueOf()를 사용하면 new Integer()를 반환해줌
        // 자주 사용하는 숫자 값(-128 ~ 127) 재사용힘.(캐싱. 문자열 풀처럼 자바가 미리 객체 만들어놓고 필요할 때 반환해줌. 성능 최적화).
        // 불변
        Integer integerObj = Integer.valueOf(10);
        Integer integerObj2 = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println(integerObj.intValue());
        System.out.println(longObj.longValue());

        System.out.println(newInteger == integerObj); // false. 서로 다른 참조값을 가짐
        System.out.println(newInteger.equals(integerObj)); // true. 내부에 있는 값으로 비교하도록 equals()가 재정의 되어 있음.
        // 래퍼 클래스 값 비교힐 때 equals() 사용하기

        // true. 자바가 최적화해서 같은 참조값을 바라보고 있음
        System.out.println(integerObj == integerObj2);

        // 래퍼 클래스 객체 그대로 출력해도 내부에 있는 값을 문자로 출력하도록 toString() 재정의 되어 있음
    }
}
