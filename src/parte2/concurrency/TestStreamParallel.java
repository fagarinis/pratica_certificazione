package parte2.concurrency;

import java.util.stream.Stream;

public class TestStreamParallel {
    public static void main(String[] args) {
        String output = Stream.of("hi", "fi").parallel()
                .reduce("-", (s1, s2) -> s1 + s2);
        System.out.println(output);
    }
}
