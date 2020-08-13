package parte2.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTestOptional2 {

    public static void main(String[] args) {
        // stampa Optional.empty
        System.out.println(Stream.of(Optional.ofNullable(null)).findFirst().get());
    }
}
