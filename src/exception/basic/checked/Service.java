package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리
    public void callCatch() {
        try {
            // call() 했더니 폭탄을 맞고 다시 여기로 던져짐
            // 그러면 이제 폭탄 처리 해야지 catch로
            client.call();

            // 예외 객체 참조값이 넘어옴
            // catch로 폭탄이 넘어온 순간 폭탄은 해제됨
            // but, try로 던져진 예외 클래스와 catch에서 잡으려고 하는 예외 클래스가 다른 종류면 컴파일 오류남
            // ex) try로 던져진 예외 클래스: MyCheckedException, catch에서 잡으려고 하는 예외 클래스: RuntimeException

            // 부모 예외를 잡으면 자식도 잡힘.
            // MyCheckedException 대신에 Exception 넣어도 가능
        } catch (MyCheckedException e) {
            // MyCheckedException -> Exception -> Throwable 상위 객체에 오류 메세지를 보관하는 기능(detailMessage)이 있음. getMessage로 호출 가능
            System.out.println("exception handling. msg: " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }


    // 체크 예외를 밖으로 던지는 코드
    // 체크 예외는 예외를 잡지 않고 밖으로(catchThrow을 호출한 곳) 던지려면 throws 예외를 메서드에 필수로 선언.
    // throws Exception도 가능. 이렇게 하면 catchThrow를 호출했던 main 메서드에도 똑같이 throws Exception 해줘야함
    // 자식 예외 클래스(MyCheckedException)를 던졌을 땐 부모(Exception)로 받을 수 있지만
    // 부모를 던졌는데 자식으로 받을 순 없음.
    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
