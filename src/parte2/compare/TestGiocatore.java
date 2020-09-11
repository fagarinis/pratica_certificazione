package parte2.compare;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestGiocatore {
    public static void main(String[] args) {

        TreeSet<Giocatore> list = new TreeSet<Giocatore>(
                List.of(
                new Giocatore(2),
                new Giocatore(21),
                new Giocatore(10),
                new Giocatore(20)));


//        System.out.println(new Giocatore(10).compareTo(new Giocatore(5)));
        System.out.println(list);
        System.out.println(list.higher(new Giocatore(9)));

        TreeSet<Giocatore> list2 = new TreeSet<>(new Giocatore(1));
        list2.addAll(List.of(
                new Giocatore(2),
                new Giocatore(21),
                new Giocatore(10),
                new Giocatore(20)));


        System.out.println(list2);
        System.out.println(list2.higher(new Giocatore(9)));
    }
}
