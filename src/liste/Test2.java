package liste;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(2);
        list.add(2);
        list.add(-129);
        list.add(-129);

        m1(list.get(0));

        Integer i = 5;
        m1(i);
    }

    public static void m1(int n) {
        System.out.println("int");
    }

    public static void m1(Integer n) {
        System.out.println("Integer");
    }


}
