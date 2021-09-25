import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx1 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        System.out.println("-----------------");

        LocalDateTime newTime = time.minusHours(3);
        System.out.println(newTime);
        System.out.println("-----------------");
        LocalDateTime newDay = newTime.plusDays(5);
        System.out.println(newDay);

        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
        System.out.println(date2);


    }
}
