package parte2.list;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        List<String> l1 = new ArrayList<>(List.of("a", "b"));
        List<String> l2 = new ArrayList<>(Collections.singletonList("c"));
        Collections.copy(l1, l2);
        l2.set(0, "d");
        System.out.println(l1);
    }
}

