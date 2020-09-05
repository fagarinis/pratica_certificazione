package parte2.locale;

import java.util.ListResourceBundle;

public class Person_fr extends ListResourceBundle {
    public Object[][] getContents() {
        return new Object[][]{
                {"template", "J''ai {0} ans"},
                {"age", 23.4}
        };
    }
}
