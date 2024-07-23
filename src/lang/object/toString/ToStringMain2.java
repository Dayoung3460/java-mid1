package lang.object.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car modelY = new Car("Model Y");
        Dog dog1 = new Dog("dog1", 2);
        Dog dog2 = new Dog("dog2", 5);

        System.out.println("1. basic lang.object.toString calling");
        System.out.println(modelY);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. using lang.object lang.object.poly");
        ObjectPrinter.print(modelY);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // Dog에서 lang.object.toString()을 오버라이딩 해버려서 객체의 참조값(객체의 해쉬코드)을 볼 수 없다!
        // -> 직접 해쉬코드 꺼내서 보면 됨.
        // Integer.toHexString(): 16진수 문자열 타입으로 변경
        String hashCode = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(hashCode);

        String hashCode2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println(hashCode2);

    }
}
