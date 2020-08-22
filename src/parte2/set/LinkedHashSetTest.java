package parte2.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("c");
        set.add("b");
        set.add("a");
        set.add("a");
        set.add("b");
        System.out.println(set);
    }
}
