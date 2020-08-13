package parte2.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestFile {
    public static void main(String[] args) throws IOException {

        Path p1 = Path.of("f1.txt");
//        Files.createFile(p1);
        Path p2 = Path.of("f2.txt");

        Files.move(p1, p2); // se f1.txt e f2.txt esistono: FileAlreadyExistsException

        boolean fileExists = Files.notExists(p1);
        System.out.println(fileExists);

    }
}
