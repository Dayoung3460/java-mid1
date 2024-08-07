package exception.basic.checked;

// Exception을 상속받은 예외 class는 체크 예외(컴파일 단계에서 오류가 나는 예외)가 됨.

public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);
    }
}
