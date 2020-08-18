package parte2.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTestOptional2 {

    public static void main(String[] args) {
        // stampa Optional.empty
        System.out.println(Stream.of(Optional.ofNullable(null)).findFirst().get());


        //crea stream
        Stream stream = Stream.ofNullable("ciao");
        Stream<String> stream2 = Stream.<String>builder().add("a").build();
        Stream<Double> stream3 = Stream.generate(() -> Math.random()); //infinite stream provided by supplier

        stream3.limit(10).forEach(n-> System.out.println(n)); //senza limit andrebbe all'infinito

    }
}
