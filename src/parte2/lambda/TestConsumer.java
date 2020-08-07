package parte2.lambda;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {
        Consumer<String> c = s -> s.toUpperCase(); // è valido anche se consumer returna void perché result of "s.toupperCase() is discarded"
    }
}
