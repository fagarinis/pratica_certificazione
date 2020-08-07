package parte2.path;

import java.nio.file.Path;

public class TestPath {
    public static void main(String[] args) {
        Path path = Path.of("a/b/c");
        System.out.println(path.getRoot()); // null
        System.out.println(path.getParent()); // a/b
        System.out.println(path.getFileName()); // c
        System.out.println(path.getName(1)); // b


        System.out.println("Resolve siblings----"); // risolve il parte2.path sul parent del primo come se fosse a/ resolve a/c
        Path path1 = Path.of("a/c");
        Path path2 = Path.of("a/c");
        System.out.println(path1.resolveSibling(path2));
    }
}
