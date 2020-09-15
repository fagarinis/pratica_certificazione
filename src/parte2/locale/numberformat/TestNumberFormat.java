package parte2.locale.numberformat;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TestNumberFormat {
    public static void main(String[] args) {
        double digit = 1234.193;

        NumberFormat numberFormat = new DecimalFormat("_00.0");
        System.out.println(numberFormat.format(digit));
    }
}
