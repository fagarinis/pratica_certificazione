package parte2.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {

    int[] i = new int[3];

    public static void main(String[] args) {


        String[] array = Stream.of("1","2","3","4").toArray(len -> new String[len]);

        System.out.println(Arrays.toString(array));

    }
}
