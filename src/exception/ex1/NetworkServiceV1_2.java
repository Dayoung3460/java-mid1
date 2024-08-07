package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)) {
            System.out.println("[network error] code: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)) {
            System.out.println("[network error] code: " + sendResult);
            return;
        }

        client.disconnect();

    }

    private static boolean isError(String result) {
        return !result.equals("success");
    }
}
