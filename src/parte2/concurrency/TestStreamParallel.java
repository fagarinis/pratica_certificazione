package parte2.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamParallel {
    public static void main(String[] args) {
        test2();
    }


    static void test1() {
        String output = Stream.of("hi", "fi").parallel()
                .reduce("-", (s1, s2) -> s1 + s2);
        System.out.println(output);
    }

    static void test2() {
        List<Character> result = Stream.of('W', 'o', 'l', 'f').unordered().parallel()
                .<List<Character>>collect(ArrayList<Character>:: new, (list, c) -> list.add(c), (list1, list2)-> list1.addAll(list2));
        System.out.println(result);
    }
}
