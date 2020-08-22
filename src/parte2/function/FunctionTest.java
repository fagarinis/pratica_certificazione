package parte2.function;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {


    }

    public static void FunctionComposition() {
        Function<Integer, Double> f1 = i -> (double) (i + 2); // Line 1
        Function<Double, Integer> f2 = d -> (int) (d * 3); // Line 2

        Function<Double, Double> f3 = f2.andThen(f1); // Line 3
    }
}
