package parte2.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(2);
        deque.add(5);
        deque.add(7);
        deque.add(8);
        deque.add(10);
        deque.add(11);
        deque.add(12);

        System.out.println(deque);

        deque.pop(); //rimuove il primo oppure. se no c'è exception -> equivalente a removeFirst()
        deque.poll(); // rimuove il primo. se non c'è: null -> equivalente a pollFirst()


        deque.getFirst(); // returna il primo. se non c'è: exception
        deque.peekFirst(); // returna il primo. se non c'è: null

        System.out.println(deque);
    }
}
