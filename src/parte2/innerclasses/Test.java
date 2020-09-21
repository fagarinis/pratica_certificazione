package parte2.innerclasses;

public class Test {
    class Foo {
        void m() {
            System.out.println("Foo");
        }
    }

    public static void main(String[] args) {
        Foo foo = new Test().new Foo() {
            void m() {
                System.out.println("Bar");
            }
        };
        foo.m();
    }
}
