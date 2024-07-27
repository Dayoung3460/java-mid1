package lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class helloClass = Hello.class;
        // 위와 같은 코드
        Class aClass = Class.forName("lang.clazz.Hello");

        // HelloClass에서 생성자 선택하고, 선택된 생성자 기반으로 인스턴스 생성.
        // Hello 클래스 타입에 대입 시켜야하기 때문에 캐스팅 시킴
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        // 참조값을 가진 객체 출력
        System.out.println(hello);
        String result = hello.hello();
        System.out.println(result);
    }
}
