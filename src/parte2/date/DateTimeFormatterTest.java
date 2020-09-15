package parte2.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterTest {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy, 'at' hh:mm");
        System.out.println(dateFormat.format(new Date()));


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy, 'at' hh:mm zzzz a");
        String stringDate = ZonedDateTime.now().format(dateTimeFormatter);
        System.out.println(stringDate);
    }
}
