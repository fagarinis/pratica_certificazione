package parte2.statici;

public class TestGenerics<T> {

    T test; // OK
//    private static T variabileTest // non si può assegnare una variabile statica generica a una classe generics

    public static void main(String[] args) {
        System.out.println("test");
    }
}
