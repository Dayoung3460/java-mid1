package exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if(connectError) {
            throw new NetworkClientExceptionV2("ConnectError", address + " server connect failed");
        }

        System.out.println(address + " server connect success");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if(sendError) {
            throw new NetworkClientExceptionV2("SendError", "sending data failed");
        }

        System.out.println(address + " data sending: " + data);
    }

    public void disconnect() {
        System.out.println(address + " server disconnect");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }
        if(data.contains("error2")) {
            sendError = true;
        }

    }
}
