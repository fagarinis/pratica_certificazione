package parte2.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestConsumer {

    public static void main(String[] args) {
        Consumer<String> c = s -> s.toUpperCase(); // è valido anche se consumer returna void perché result of "s.toupperCase() is discarded"
        testMethodReference();
    }

    static void testMethodReference() {
        String calimero = "Calimero";
        Predicate<String> predicate = (str) -> calimero.isBlank();
        Predicate<String> predicateWithMethodReference = String::isBlank;

        boolean calimeroIsBlank = predicateWithMethodReference.test(calimero);
        System.out.println("Calimero is blank: " + calimeroIsBlank);


        if (!calimeroIsBlank) {
            Function<String, String> f = (s) -> s.toUpperCase();
            Function<String, String> fWithReference = String::toUpperCase;

            System.out.println(fWithReference.apply("è un ingiustizia però!"));
        } else {

            BiFunction<Integer, String, String> substring = (integer, str) -> str.substring(integer);
            // il primo parametro String è il this, quelli dopo sono parametri della funzione apply della function.
            BiFunction<String, Integer, String> substringWithReference = String::substring;
            String result = substringWithReference.apply("java come lava", 1);// il metodo viene chiamato sulla stringa, e il numero è il parametro

            System.out.println(result);
        }
    }
}
