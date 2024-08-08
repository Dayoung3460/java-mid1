package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
//        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("data to send: ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("program closed successfully.");
    }
}
