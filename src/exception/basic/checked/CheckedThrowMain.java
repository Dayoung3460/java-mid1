package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        // catchThrow에서 예외 해결을 못하고 예외를 던짐
        // 근데 나도 해결 못해. 또 예외 던짐(main 메서드에 throws 선언)
        // main에서는 이제 예외 던질 곳이 없기 때문에 컴파일 오류는 안나고 프로그램 자동 종료됨
        service.catchThrow();

        // 위에서 예외가 터졌기 때문에 아래 코드 출력 안됨
        System.out.println("정상 종료");
    }
}
