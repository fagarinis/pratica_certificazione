package parte2.locale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TestFormatter {
    public static void main(String[] args) throws ParseException {
        NumberFormat numberFormatter = NumberFormat.getNumberInstance(Locale.FRANCE);

        String formattedString = numberFormatter.format(1234.5);
        // 1234.5 is formatted as "1 234,5" in French
        //                         "1.234,5" in Italian and GERMANY
        //                         "1,234.5" in UK and US and CANADA and JAPANESE
        System.out.println("formatted string: " + formattedString);

        Number result = numberFormatter.parse(formattedString);

        System.out.println(result);
    }
}
