package parte2.compare;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestGiocatore {
    public static void main(String[] args) {

        Set<Giocatore> list = new TreeSet<Giocatore>(
                List.of(
                new Giocatore(2),
                new Giocatore(21),
                new Giocatore(10),
                new Giocatore(20)));


//        System.out.println(new Giocatore(10).compareTo(new Giocatore(5)));
        System.out.println(list);
    }
}
