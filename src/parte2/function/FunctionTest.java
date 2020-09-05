package parte2.function;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        functionCompose();


    }

    public static void FunctionComposition() {
        Function<Integer, Double> f1 = i -> (double) (i + 2); // Line 1
        Function<Double, Integer> f2 = d -> (int) (d * 3); // Line 2

        Function<Double, Double> f3 = f2.andThen(f1); // Line 3
    }

    public static void functionCompose(){
        Function<String, Object> f1 = s -> s.toUpperCase();
        Function<String, String> f2 /* non può essere <String, Object> */ = s -> s.toLowerCase();

        Object result = f1.compose(f2).apply("cIaO"); //applica prima f2 poi f1, il tipo deve matchare

    }
}
