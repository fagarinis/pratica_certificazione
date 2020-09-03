package parte2.anonymous;

public class B {

    // static class
    class A {

    }

    // static nested class
    static class S {

    }

    public static void main(String[] args) {


    }

    static void metodoStatico() {
        B b = new B();

//        A a = new A(); // No!
        A a2 = new B().new A();

        S s = new S();
        S s2 = new B.S(); // constructor for static classes
//        S s3 = new B().new S(); // No! po
    }

    void metodo() {
        B b = new B();

        A a = new A(); // No!
        A a2 = new B().new A();

        S s = new S();
        S s2 = new B.S();
//        S s3 = new B().new S(); // No!
    }

}
