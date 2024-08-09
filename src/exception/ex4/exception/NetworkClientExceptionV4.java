package exception.ex4.exception;

// 실무에선 체크 예외보다 언체크 예외를 주로 사용
// 체크 예외 단점:
// 다양한 서버(네크워크, 디비, 외부 서버 등) 연동 시 예외를 잡을 때 catch로 수많은 예외를 잡아줘야함.
// 예외 안잡고 던지면 throws에 예외 겍체를 줄줄이 추가해야함
// 웹 어플리케이션 단계에서 해결할 수 없는 예외가 생각보다 많이 발생함. (예를 들어, 네트워크 장애, 서버 장애 등)

// 언체크 예외 장점:
// 예외를 던지는 메서드에서 throws를 사용하지 않아도 됨 - 코드 깔끔
// 잡아야하는 예외만 선택해서 잡아도 됨
// 해결할 수 없는 예외들은 한 곳에서 처리하면 됨.
public class NetworkClientExceptionV4 extends RuntimeException{
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
