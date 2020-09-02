package parte2.stream;

import java.util.Optional;

public class OrElseTest {

    static int i = 0;

    public static void main(String[] args) throws Exception {
        Integer result = Optional.of(5).orElse(increaseCounter()); // method is called
        Integer result2 = Optional.of(9).orElseThrow(() -> new Exception());

        System.out.println(result);
        System.out.println(result2);
        System.out.println(i);
    }

    static int increaseCounter() {
        return ++i;
    }
}
