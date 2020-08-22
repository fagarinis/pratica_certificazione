package parte1.ereditarieta;

public class InterfaceAbstractClassInheritanceTest {
}

interface A {
    public default void m() {
        System.out.println("A");
    }
}

abstract class B {
    abstract void m();
}

class C extends B implements A {
    public void m() { // se non è public da errore perché fa l' override del metodo in A che ha un accesso meno restrittivo (public)
        System.out.println("C");
    }
}
