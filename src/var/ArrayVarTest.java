package var;

public class ArrayVarTest {
    public static void main(String[] args) {

        //var e [] non possono stare insieme nel left side assignment
        //var è solo per variabili locali dentro a un metodo
        var array = new String[][]{new String[]{"look"}, new String[]{"look"}};


        final String i;

        String ciao="ciao";
        i = ciao;

        System.out.println( i == ciao);
    }
}
