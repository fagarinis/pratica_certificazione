package parte2.stream;

import java.util.stream.Stream;

public class FindAnyTest {
    public static void main(String[] args) {
        System.out.println((Stream.of(1,2,3).parallel().filter(n -> true).findAny()));

    }
}
