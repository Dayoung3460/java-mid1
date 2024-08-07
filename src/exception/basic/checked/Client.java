package exception.basic.checked;

public class Client {
    // 여기서 해결 못해서 밖으로 예외를 던질 때 throws 키워드 사용
    // 해당 메서드를 호출했던 곳으로 예외를 던짐
    public void call() throws MyCheckedException{
        // ex) 어떤 문제가 발생해서 예외를 던져야함!
        // throw: 예외 객체 인스턴스를 만들어서 예외 발생
        throw new MyCheckedException("ex");

        // throw 아래의 코드는 실행안됨.
        // throw 발생하면 바로 throws로 예외를 밖으로 던짐
    }
}
