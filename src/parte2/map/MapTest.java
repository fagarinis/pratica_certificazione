package parte2.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Jane", "prova");
        System.out.println(map);

        map.compute("Jane", (s1, s2) -> "Hi " + s2);
        System.out.println(map);

        String result = map.computeIfAbsent("Johnson", key -> "oh long " + key); //returna il risultato della funzione
        System.out.println("Map after computeIfAbsent");
        System.out.println(map);
    }
}
