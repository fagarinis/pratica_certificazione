package parte1.arrays;

import java.util.Arrays;

public class ListTest {

    public static void main(String[] args) {
        String [] arr = {"EARTH", "MOON", "SUN", "PLUTO"};
        var list = Arrays.asList(arr);
        list.set(3, "JUPITER"); //Line n1
        list.forEach(str -> System.out.println(str)); //Line n2
    }
}
