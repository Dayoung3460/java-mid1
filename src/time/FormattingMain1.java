package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // formatting: Date > String
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("formattedDate = " + formattedDate);

        // parsing: String > Date
        String dateString = "2024년 12월 31일";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("parsedDate = " + parsedDate);

    }
}
