package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("data to send: ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);

                // 언체크 예외의 부모인 Exception으로 퉁쳐서 잡기
            } catch (Exception e) {
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("program closed successfully.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 사용자가 보는 메세지
        System.out.println("Sorry. Something went wrong.");

        // 개발자용 메세지
        // stack trace 출력
        e.printStackTrace(System.out);
//        e.printStackTrace();
//        e.printStackTrace(System.err); // 빨간색으로 보여줌

        // 필요하면 예외 별로 추가 처리 가능
        // e는 Exception타입의 객체가 넘어온거임. instanceof로 타입 확인 가능
        if(e instanceof SendExceptionV4 sendEx) {
            System.out.println("send error: " + sendEx.getSendData());
        }

    }
}
