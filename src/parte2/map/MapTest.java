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

        mergeTest();
    }

    static void mergeTest() {
        System.out.println("-----Merge test------");
        Map<Integer, String> formazioneSquadra = new HashMap<>();

        formazioneSquadra.put(5, "Mexes");
        formazioneSquadra.put(10, "Totti");
        formazioneSquadra.put(7, "Ronaldo");
        formazioneSquadra.put(1, "Pelizzoli");
        formazioneSquadra.put(2, null);

        formazioneSquadra.merge(1, "Buffon", (currentValue, value) -> currentValue.substring(0, 4) + value.substring(2)); // if value exists, merge
        formazioneSquadra.merge(2, "Cafu", (x, y) -> x + y); // if key or value doesn't exists, create without calling function
        formazioneSquadra.merge(7, "lol", (x, y) -> null); //if exists and function return null, remove


        System.out.println(formazioneSquadra);

    }
}
