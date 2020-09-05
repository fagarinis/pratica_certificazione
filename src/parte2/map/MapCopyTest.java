package parte2.map;

import java.util.HashMap;
import java.util.Map;

public class MapCopyTest {

    public static void main(String[] args) {
        Map map = new HashMap<Integer, String>();

        map.put(1, "persona1");
        map.put(2, "persona2");
        map.put(3, "persona3");
        map.put(4, "persona4");

        Map mapCopy = Map.copyOf(map);

        mapCopy.put(5, "persona5");// Exception, unmodifiable list
        mapCopy.remove(4); // Exception, unmodifiable list

        System.out.println(mapCopy);

    }
}
