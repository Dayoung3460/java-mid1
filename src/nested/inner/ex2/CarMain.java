package nested.inner.ex2;

public class CarMain {
    public static void main(String[] args) {
        // Car 클래스 인스턴스 생성할 때 Engine 인스턴스도 생성됨
        Car modelY = new Car("model Y", 100);
        modelY.start();
    }
}
