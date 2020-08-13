package parte2.path;

import java.nio.file.Path;

public class TestPath2 {
    public static void main(String[] args) {
        Path path = Path.of("/", "..", "root", "f.txt");
        System.out.println(path);
        System.out.println(path.getName(0));

    }
}
