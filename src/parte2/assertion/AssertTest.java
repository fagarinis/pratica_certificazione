package parte2.assertion;

public class AssertTest {

    public static void main(String[] args) {
        int x = 3;

        // per usare le assertion su intellij
        // Run -> Edit Configuration -> fill VM options with -ea
        assert x < 0 : "x deve essere maggiore di 0";
        System.out.println(x);
    }
}
