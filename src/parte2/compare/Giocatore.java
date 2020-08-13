package parte2.compare;

import java.util.Comparator;

public class Giocatore implements Comparable<Giocatore>, Comparator<Giocatore> {
    private int numeroMaglia;
    private String squadra;

    public Giocatore(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    @Override
//    questo viene usato automaticamente nelle liste automaticamente ordinate come i SortedSet e
//    la sua implementazione specifica la logica della differenza nell'ordine naturale del this rispetto all'other
//
//    this compareTo other è n < 0  -> il this viene prima dell'other di n posizioni
//    this compareTo other è n > 0  -> il this viene dopo dell'other di n posizioni
//    this compareTo other è n == 0 -> il this è uguale all'other nell'ordine
    public int compareTo(Giocatore o) {
        return this.numeroMaglia - o.numeroMaglia;
    }


    public int compare(Giocatore g1, Giocatore g2){
        return g2.numeroMaglia - g1.numeroMaglia;
    }

    @Override
    public String toString() {
        return "Giocatore[" + numeroMaglia + "]";
    }
}
