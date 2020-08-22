package parte2.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {

        test1();
    }

    static void test1() {
        List<Integer> listInteger = List.of(1, 2, 3);
        List<String> listString = List.of("a", "b", "c");

        Stream.of(listInteger, listString).flatMap(list -> Stream.of(list)).forEach(l -> System.out.println(l));
    }
}

