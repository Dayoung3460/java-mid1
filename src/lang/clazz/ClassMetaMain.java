package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 'Class' 클래스

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        // String 클래스에 대한 정보 조회
        Class clazz = String.class;
        // 인스턴스 조회
        Class clazz1 = new String().getClass();
        // 문자열로 클래스에 대한 정보 조회
        Class clazz2 = Class.forName("java.lang.String");

        // String이 가진 모든 필드들 조회
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        // String이 가진 모든 method들 조회
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        // 상위 클래스 정보 출력
        System.out.println(clazz.getSuperclass().getName());

        // 가지고 있는 인터페이스들 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }

}
