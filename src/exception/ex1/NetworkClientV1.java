package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if(connectError) {
            System.out.println("server connect failed");
            return "ConnectError";
        }

        System.out.println(address + " server connect success");
        return "success";
    }

    public String send(String data) {
        if(sendError) {
            System.out.println("sending data failed");
            return "SendError";
        }

        System.out.println(address + " data sending: " + data);
        return "success";
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
