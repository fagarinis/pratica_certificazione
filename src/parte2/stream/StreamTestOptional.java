package parte2.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTestOptional {

    public static void main(String[] args) {
//        testOptionalOr();
        testOptionalOf();
    }

    static void testOptionalOr() {
        Integer n = null;
        //
        Integer result = Optional.ofNullable(n)
                // se il valore nell'optional precedente è presente returnalo
                // altrimenti fornisci un optional con una funzione supplier
                .or(() -> Optional.ofNullable(null))
                // se il valore nell'optional precedente è presente
                // returnalo altrimenti manda un eccezione NoSuchElementException
                .orElseThrow();
        System.out.println(result);
    }

    static void testOptionalOf() {
        Integer n = null;
        Integer x = Optional.ofNullable(n).orElse(5);
        System.out.println(x);
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
