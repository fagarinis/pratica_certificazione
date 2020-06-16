package stringhe;

public class TestStringaStatica {

    static String str = "KEEP IT "; //Line n1

    public static void main(String[] args) {
//        String str = str + "SIMPLE"; //Line n2 <- va in errore di compilazione poiché non sa a quale variabile str riferirsi
        System.out.println(str);
    }
}
