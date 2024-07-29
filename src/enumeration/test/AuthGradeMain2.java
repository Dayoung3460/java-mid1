package enumeration.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your level " + Arrays.toString(values) + ": ");

        String grade = scanner.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());

        System.out.println("Your level is " + authGrade.getDescription());
        System.out.println("= Menu List=");

        List<String> menuList = AuthGrade.getMenuList(authGrade);
        for (String menu : menuList) {
            System.out.println(menu);
        }

    }
}
