package parte2.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {
        String result = Stream.of("il mio", "cane", "jack").collect(Collectors.joining("-", "<", ">"));
        System.out.println(result);

//        collect1Test();
//        collect2Test();
//        collect3Test();

    }

    static void collect1Test() {
        List<Integer> lista = List.of(1, 2, 3, 4, 5)
                .parallelStream()
                // il primo parametro fornisce un contenitore per il risultato
                // il secondo aggiunge gli elementi dello stream a un contenitore accumulatore
                // il terzo inserisce gli elementi del contenitore accumulatore nel contenitore per il risultato
                // comodo per pararellizare facilmente operazioni costose
                .collect(ArrayList::new, (accumulatorlist, number) -> accumulatorlist.add(number), (resultList, accumulatorlist) -> resultList.addAll(accumulatorlist));
        System.out.println(lista);
    }

    static void collect2Test() {
        String stringheConcatenate = List.of("ciao", "evviva", "java", "11")
                .parallelStream()
                .collect(() -> new StringBuilder(),
                        (accumulatorString, str) -> accumulatorString.append(str),
                        (result, accumulatedString) -> result.append(accumulatedString))
                .toString();

        System.out.println(stringheConcatenate.length());
        System.out.println(stringheConcatenate);
    }

    static void collect3Test(){
        String result = List.of("a", "b")
                .parallelStream()
                .collect(String::new, String::concat, (String::concat));
        // non returna nulla perché String è una classe immutabile ed utilizzare il concat non cambia l'oggetto
        // String su cui viene chiamato
        System.out.println(result);
    }
}
