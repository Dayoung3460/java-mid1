package exception.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        // try-with-resources 구문
        // client 변수 사용할 수 있는 스코프가 try 블록 내부로 제한됨
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
            // close 메서드 자동 호출
        } catch (Exception e) {
            System.out.println("[exception]: " + e.getMessage());
            throw e;
        }


    }
}
