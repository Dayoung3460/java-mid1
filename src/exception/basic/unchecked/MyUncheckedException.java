package exception.basic.unchecked;

// RuntimeException 상속받으면 언체크 예외가 됨

public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}
