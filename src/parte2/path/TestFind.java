package parte2.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestFind {
    public static void main(String[] args) throws IOException {
        Path root = Path.of("root");
        Path file = Path.of("root/dir/f.txt");
        Files.createDirectories(file.getParent());
        Files.createFile(file);
        long count = Files.find(root, 2, (p, a) -> true).count();
        System.out.println(count);
    }
}
