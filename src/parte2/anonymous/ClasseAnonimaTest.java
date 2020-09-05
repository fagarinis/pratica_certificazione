package parte2.anonymous;

abstract class Frutto {
    abstract String getColore();
}

public class ClasseAnonimaTest {

    class InnerClass {
    }


    public static void main(String[] args) {
//        test1();
    }

    static void test1() {

        int contaChiamateAGetColore = 0;

        Frutto fruttoAnonimo = new Frutto() {
            String getColore() {
//                contaChiamateAGetColore++; // can't modify local variable, needs final, or effectively final
//                int i = contaChiamateAGetColore ; // non puo
                return "rosso";
            }
        };

    }
}
