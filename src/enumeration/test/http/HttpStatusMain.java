package enumeration.test.http;

import java.util.Scanner;


public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();

        HttpStatus httpStatus = HttpStatus.findByCode(httpCodeInput);
        if(httpStatus == null) {
            System.out.println("Not defined Code");
        } else {
            System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage());
            System.out.println(httpStatus.isSuccess());

        }
    }
}
