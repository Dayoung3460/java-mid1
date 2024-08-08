package exception.ex2;

public class NetworkServiceV2_3 {
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[network error] code: " + e.getErrorCode() + " message: " + e.getMessage());

            // catch가 잡고 있는 NetworkClientExceptionV2와 상관없는 다른 예외가 발생할 경우 아래 줄은 실행되지 않기 때문에
            // 무조건 실행되는 finally 구문을 사용해서 disconnect()를 호출해야함.
        } finally {
            client.disconnect();
        }


    }
}
