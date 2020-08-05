package thread;

import java.util.concurrent.CyclicBarrier;

public class TestBarrier {
    public static void main(String[] args) {

        Runnable barrierAction = () -> System.out.println("Barrier");
        CyclicBarrier barrier = new CyclicBarrier(2, barrierAction); // un aiuto per la sincronizzazione
        /*
        un aiuto per la sincronizzazione quando occasionalmente piu thread devono aspettare tra loro
        usando il metodo barrier.await() si aspetta che il numero di thread
         */


    }
}
