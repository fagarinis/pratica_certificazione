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


        Iterator<String> iterator = list.iterator(); // l'iterator di CopyOnWriteArrayList è una copia immutabile della lista

        list.add("jack"); //quindi questa stringa non viene vista

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
