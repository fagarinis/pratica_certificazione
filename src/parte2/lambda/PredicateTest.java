package parte2.lambda;

import java.util.function.Predicate;

class Foo {
    int i;

    Foo(int i) {
        this.i = i;
    }
}

public class PredicateTest {
    static boolean compare(Foo foo, Predicate<Foo> predicate) {
        return predicate.test(foo);
    }

    public static void main(String[] args) {
        Predicate<Foo> p = f -> f.i > 0; // Line 1
        p = p.or(f -> f.i > 0).and(f -> f.i < 0); // Line 2
        boolean b = compare(new Foo(1), p); // Line 3
        System.out.println(b);
    }
}
