package parte2.generics;

import java.util.ArrayList;
import java.util.List;

public class RawTypeTest {
    public static void main(String[] args) {
        List list = new ArrayList<Integer>(); // raw type bypasses compilation check for generics

        list.add("ciao");
        list.add(new Thread());

        List<String> integerList = list;


        System.out.println(integerList);


//        List<Object> list1 = new ArrayList<Integer>(); // compilation fails
    }
}
