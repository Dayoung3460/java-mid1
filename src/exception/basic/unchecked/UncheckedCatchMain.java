package exception.basic.unchecked;

// 언체크 예외(런타임 예외) 장점: 신경쓰고 싶지 않은 언체크 예외를 무시할 수 있음. throws 부분 생략 가능
// 단점: 실수로 예외 처리하는걸 누락 할 수 있음. 컴파일 오류가 안나니까

// 현대에 와서는 체크 예외 거의 사용안함. 띠용,,,

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
