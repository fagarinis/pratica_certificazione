package parte2.locale;


import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;


public class TestResourceBundle {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("parte2.locale.Person", Locale.ENGLISH);
        String pattern = bundle.getString("template");
        MessageFormat messageFormat = new MessageFormat(pattern, Locale.FRENCH);


        double age = (double) bundle.getObject("age");
        String result = messageFormat.format(new Object[]{age});
        System.out.println(result);
    }
}
