package parte2.locale;

import java.util.ListResourceBundle;

public class Person_en extends ListResourceBundle {
    public Object[][] getContents() {
        return new Object[][]{
                {"template", "I''m {0} years old"},
                {"age", 34.5}
        };
    }
}
