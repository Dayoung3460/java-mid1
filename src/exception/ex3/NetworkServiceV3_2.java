package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

            // 크리티컬한 예외여서 요 부분만 세밀하게 잡아야할 때
            // 얘가 부모(NetworkClientExceptionV3, Exception)보다 앞에 와야함
        } catch (ConnectExceptionV3 e) {
            System.out.println("[connect error] address: " + e.getAddress() + " message: " + e.getMessage());

        // 중요한 오류 외에 자잘한 애들 잡을 때. NetworkClientExceptionV3로 그냥 퉁칠게
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[network error]: " + e.getMessage());

        // 모든 예외를 잡아야할 때. 어디선가 터질지 모르는 예외를 잡을 때,,
            // 만약 RuntimeException 이 터지면 여기서 걸림. RuntimeException 부모는 Exception이니까
        } catch (Exception e) {
            System.out.println("[unknown error]: " + e.getMessage());
        } finally {
            client.disconnect();
        }


    }
}
