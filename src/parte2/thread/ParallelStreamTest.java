package parte2.thread;

import java.util.List;

public class ParallelStreamTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 2);
        // the identity must be an identity for the combiner function
        int i = list.parallelStream().reduce(1, Integer::sum, (i1, i2) -> i1 * i2); // parallel, combiner used
        int j = list.stream().reduce(1, Integer::sum, (i1, i2) -> i1 * i2); // sequential, combiner not used
        System.out.println(i);
        System.out.println(j);

    }
}
