package exception.basic.checked;

// 체크 예외 장점: 개발자가 실수로 예외 누락하지 않도록 컴파일러를 통해 문제를 잡아줌
// 단점: 개발자가 모든 체크 예외를 반드시 잡거나 던져야하기 때문에 번거로움

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();;
        System.out.println("정상 종료");
    }
}
