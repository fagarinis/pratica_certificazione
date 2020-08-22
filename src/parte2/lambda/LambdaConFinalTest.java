package parte2.lambda;

import java.util.function.Function;

public class LambdaConFinalTest {


    public static void main(String[] args) {
        Function<Integer, Integer> f = (final Integer x) -> {
//            x = 5; La variabile final nelle lambda non permette di modificare il parametro di ingresso
            return x * 3;
        };

        int x = 5;
        Integer result = f.apply(x);
        x = 3; // ma non influisce sul parametro che vuole ricevere

        System.out.println(result);
    }
}
