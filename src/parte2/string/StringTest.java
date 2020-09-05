package parte2.string;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringTest {
    public static void main(String[] args) {
//        The CopyOnWriteArrayList was created to allow for the possibility of safe iterating over elements
//        even when the underlying list gets modified.
//        Because of the copying mechanism, the remove() operation on the returned Iterator
//        is not permitted – resulting with UnsupportedOperationException:

        List<String> list = new CopyOnWriteArrayList<>(new String[]{"il", "mio", "cane"});
        Iterator<String> iterator = list.iterator(); // immutable snapshot of the state of the list when the iterator was constructed.

        list.clear(); // l'iteratore non viene influenzato da clear della lista
        list.add("jack"); // e nemmeno da questa stringa

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
