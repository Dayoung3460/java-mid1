package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " car starts");
    }

    // 내부 클래스
    private class Engine {

        public void start() {
            // 외부 클래스의 인스턴스 변수에 접근 가능
            System.out.println("charge lv: " + chargeLevel);
            System.out.println(model + " engine starts");
        }
    }
}
