package time.test;

import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println("Enter a month: ");
        int month = scanner.nextInt();

        System.out.println("S  M  T  W  T  F  S");

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        int offset = firstDayOfMonth.getDayOfWeek().getValue();


        for (int i = 0; i < offset; i++) {
            System.out.print("   ");
        }

        int maxDay = firstDayOfMonth.lengthOfMonth();

        for (int day = 1; day <= maxDay; day++) {
            System.out.printf("%2d ", day);

            if((offset + day) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
