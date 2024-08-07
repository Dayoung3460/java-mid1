package exception.ex0;

public class NetworkClientV0 {
    // 접속할 외부 서버 주소
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + " server connect success");
        return "success";
    }

    public String send(String data) {
        System.out.println(address + " data sending: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " server disconnect");
    }
}
