package parte2.thread;

import java.util.List;

public class ParallelStreamTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3,2 );
        int i = list.parallelStream().reduce(1, Integer::sum, (i1, i2) -> i1 * i2);
        System.out.println(i);

    }
}
