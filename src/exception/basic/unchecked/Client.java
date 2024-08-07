package exception.basic.unchecked;

public class Client {
    public void call() {
        // throw로 예외 발생 후 throws 하지 않아도 자동으로 예외 던짐. (컴파일 오류 안남)
        // 생략이 될 뿐 throws MyUncheckedException 선언 해줘도 됨.
        throw new MyUncheckedException("ex");
    }
}
