package parte2.serialization;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test_filewriter.txt");
        fw.write("ciao");
        fw.close();

    }
}
