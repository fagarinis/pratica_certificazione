package parte2.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeInserimenti {

    static Deque<Integer> deque = new LinkedList<>();

    public static void main(String[] args) {
        deque.addAll(List.of(1, 2, 3));

        deque.offer(4); // add to tail
        deque.add(5); // add to tail, throw exception if capacity excedeed

        deque.push(6); // add to head, throw exception if capacity excedeed


        deque.peek(); // look first
        deque.element(); // look first element, throw exception if empty

        
        deque.poll(); // remove first element
        deque.remove(); // remove first element, throw exception if empty
        deque.pop(); // remove first element, throw exception if empty

        System.out.println("Head <- " + deque + " -> Tail");
//        test1();
    }

    static void test1(){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        var i1 = deque.peek();
        var i2 = deque.poll();
        var i3 = deque.peek();
        System.out.println(i1 + " " + i2 + " " + i3);
    }
}
