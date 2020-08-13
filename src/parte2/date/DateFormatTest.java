package parte2.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateFormatTest {
    public static void main(String[] args) {

        // il SimpleDateFormat segue dei pattern specifici di lettere,
        // vedi qui https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        // se si vuole inserire un testo bisogna metterlo tra apici ''
        DateFormat dateFormatSbagliato = new SimpleDateFormat("Timezone zz"); // eccezione
        DateFormat dateFormatCorretto = new SimpleDateFormat("'Timezone' zz"); // OK

    }
}
