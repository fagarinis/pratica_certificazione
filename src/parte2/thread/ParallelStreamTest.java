package parte2.thread;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 2);
        // the identity must be an identity for the combiner function
        int i = list.parallelStream().reduce(1, Integer::sum, (i1, i2) -> i1 * i2); // parallel, combiner used
        int j = list.stream().reduce(1, Integer::sum, (i1, i2) -> i1 * i2); // sequential, combiner not used
        System.out.println(i);
        System.out.println(j);

        testReduce();

    }

    public static void testReduce() {
        System.out.println("---- Test reduce ----");
        Stream<Integer> integerStreams = Stream.iterate(1, n -> n <= 10, n -> ++n); // attenzione n++ non funziona!
//        integerStreams.forEach(System.out::println);

        String result = integerStreams.parallel().reduce(new String(), (str, n) -> str.concat(n.toString()), (str1, str2) -> str1.concat(str2));
        System.out.println(result);
    }
}
