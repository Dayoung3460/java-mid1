package nested.anonymous.ex;

public class Ex0Main {
//    public static void helloJava() {
//        System.out.println("start");
//        System.out.println("hello java");
//        System.out.println("ends");
//
//    }
//
//    public static void helloSpring() {
//        System.out.println("start");
//        System.out.println("hello Spring");
//        System.out.println("ends");
//
//    }

    public static void hello(String program) {
        System.out.println("start");
        System.out.println("hello " + program);
        System.out.println("ends");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");

    }
}
