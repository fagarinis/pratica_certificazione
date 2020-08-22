package parte2.wildcard;

import java.util.ArrayList;
import java.util.List;

public class ListeWildCard {
    public static void main(String[] args) {

        List<? extends Number> listaGenerica = new ArrayList<Integer>();
//        listaGenerica.add(1) // error - can't add Integer to *possible* List<Double>, even though it is really List<Integer>
        listaGenerica = new ArrayList<Double>(); // ok

        List<? super Number> listaGenericaSuper = new ArrayList<>();
        listaGenericaSuper.add(4); // ok - allowed to add Integer to List<Number> or List<Object>
    }

    /*
        In generale, è raccomandato usare <? extends x> nei parametri di input dei parametri
        usare <? super x> nei parametri di output
        non usare wildcard come tipo di ritorno
    */
    public void metodoGenerico(List<? extends Number> readList, List<? super String> outputList) {
        // ...body
    }
}
