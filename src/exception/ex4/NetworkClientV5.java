package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if(connectError) {
            throw new ConnectExceptionV4(address, address + " server connect failed");
        }

        System.out.println(address + " server connect success");
    }

    public void send(String data) {
        if(sendError) {
            throw new SendExceptionV4(data, "sending data failed");
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

    // try가 끝나는 순간 자동으로 호출되는 메서드
    @Override
    public void close() {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
