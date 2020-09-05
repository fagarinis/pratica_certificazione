package parte2.lambda;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceTest {

    String oh;
    long johnson = 5L;
    String ohh;
    long pianooo;

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4)
                .reduce((n, m) -> n + m)
                .ifPresent(n -> System.out.println(n));


        Stream.of(3, 5, 65, 1)
                .reduce(somma())
                .ifPresent(System.out::println);


        Optional.of(Stream.of("oh", "long", "johnson")
                .reduce("-", (s1, s2) -> s1.concat(s2.toUpperCase())))
                .ifPresent((s) -> System.out.println(s));


        Stream.of(1, 2, 3, 4, -5)
                .min(Comparator.comparing(n -> n))
                .ifPresent(n -> System.out.println(n));
    }

    public static BinaryOperator<Integer> somma() {
        return ((a, b) -> a + b);
    }
}
