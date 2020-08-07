package parte2.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceTest {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4)
                .reduce((n, m) -> n + m)
                .ifPresent(n -> System.out.println(n));


        Stream.of(3, 5, 65, 1)
                .reduce(somma())
                .ifPresent(System.out::println);


        Stream.of(1, 2, 3, 4, -5)
                .min(Comparator.comparing(n -> n))
                .ifPresent(n -> System.out.println(n));
    }

    public static BinaryOperator<Integer> somma() {
        return ((a, b) -> a + b);
    }
}
