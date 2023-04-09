import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q4 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println("The date in dd-mm-yyyy is " + text);
    }
}
