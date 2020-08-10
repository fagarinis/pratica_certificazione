package parte2.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTestOptional {

    public static void main(String[] args) {
        testOptionalOf();
    }

    static void testOptionalOf() {
        Integer n = null;
        Integer x = Optional.ofNullable(n).orElse(5);
        System.out.println(n);
    }

    static void testOptionalOfNullable() {
        Integer n = 5;
        Optional<Integer> x = Optional.ofNullable(n); //returna un optional.empty se l'oggetto è null altrimento un optional con valore dentro
        System.out.println(x);
    }

    static void testStream() {
        Integer data = Stream.<Integer>empty().findAny()
                .or(() -> Optional.of(new Integer(1))) // Line 1
                .orElseGet(() -> new Integer(2)); // Line 2

        System.out.println(data);
    }

}
