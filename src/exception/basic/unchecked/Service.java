package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    // 필요한 경우 예외 잡아서 처리할 수 있음
    public void callCatch() {
        try {
            client.call();
        } catch (RuntimeException e) {
            System.out.println("Exception handling: msg: " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // throws 안해도 알아서 예외 던짐
    public void callThrow() {
        client.call();
    }
}
