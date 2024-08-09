package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

            // 예외를 세분화 해서 처리할 수 있음
            // catch(ConnectExceptionV3 | SendExceptionV3 e) 이런식으로도 가능.
        } catch (ConnectExceptionV3 e) {
            System.out.println("[connect error] address: " + e.getAddress() + " message: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[send error] data: " + e.getSendData() + " message: " + e.getMessage());
        } finally {
            client.disconnect();
        }


    }
}
