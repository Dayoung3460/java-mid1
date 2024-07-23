package poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) {
//        object.sound();

        if (object instanceof Dog dog) {
            dog.sound();
        } else if(object instanceof Car car) {
            car.move();
        }
    }
}
