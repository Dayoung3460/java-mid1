package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        // 내부 클래스는 외부 클래스 인스턴스를 먼저 만들고
        // 그 인스턴스에서 내부 클래스의 인스턴스를 생성해줘야함
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
        innerClass.hello();
    }
}
