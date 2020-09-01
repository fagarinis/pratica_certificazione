package parte2.stream;

import java.util.stream.Stream;

public class IllegalStateTest {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2);
        stream.filter(n -> n % 2 == 0);
        stream.forEach(System.out::print); //exception, stream already used
    }
}
