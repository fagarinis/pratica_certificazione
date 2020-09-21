package parte2.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        var i1 = deque.peek();
        var i2 = deque.poll();
        var i3 = deque.peek();
        System.out.println(i1 + " " + i2 + " " + i3);
    }
}
