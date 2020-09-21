package parte2.innerclasses;

public class Foo {
    private int i = 0;

    private class Bar { // Line 1
        private String s = "java"; // Line 2

        private void m(String s) { // Line 3
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        Bar bar = foo.new Bar();
        bar.m(bar.s);
    }
}
