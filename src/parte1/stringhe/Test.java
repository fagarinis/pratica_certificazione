package parte1.stringhe;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String a = "ciao";
        String b = new String("ciao");
        String c = "ciao";
        System.out.println(Arrays.asList(c.split("",0)));


        System.out.println(a == b);
        System.out.println(a == c);
    }
}
