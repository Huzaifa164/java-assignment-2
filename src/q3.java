import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class q3 {
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        System.out.println("The current date is " + curDate);
        LocalTime curTime = LocalTime.now();
        System.out.println("The current time is " + curTime);
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println("The current date and time is " + curDateTime);
    }
}
