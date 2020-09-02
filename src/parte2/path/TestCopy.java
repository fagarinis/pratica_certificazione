package parte2.path;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class TestCopy {
    public static void main(String[] args) throws IOException {
        Path pathOrigin = Path.of("f1.txt");
        Path pathDestination = Path.of("f2.txt");

        InputStream in = Files.newInputStream(pathOrigin);
        OutputStream out = Files.newOutputStream(pathDestination);

        Files.copy(pathOrigin, pathDestination, StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(pathOrigin, out);
        Files.copy(in, pathDestination, StandardCopyOption.REPLACE_EXISTING);
    }
}
