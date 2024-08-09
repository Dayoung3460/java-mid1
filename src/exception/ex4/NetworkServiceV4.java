package exception.ex4;

public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            // try에서 예외 터지면 복구할 수 없다는 시나리오.
            // 밖으로 걍 던짐(언체크 예외)
            // -> 해결할 수 없는 예외보다는 본인 코드에 집중할 수 있음 - 코드 깔끔
        } finally {
            client.disconnect();
        }


    }
}
