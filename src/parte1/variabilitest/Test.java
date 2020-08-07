package parte1.variabilitest;

public class Test {
    public static void main(String[] args) {

        Parent p = new Parent();

        p = new Son();
        System.out.println(p.eta); // returna l'eta del Parent...

        Parent p2 = new Son();
        System.out.println(p2.eta); // returna l'eta del Parent...

        Son s = new Son();
        System.out.println(s.eta); // fixed! returna l'eta del Son
    }
}
