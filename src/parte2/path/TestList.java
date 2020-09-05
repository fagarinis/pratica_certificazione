package parte2.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class TestList {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/ws_intellij_RT");
        List<Path> listaCartelle = Files.list(path).collect(Collectors.toList()); // lista di tutte le cartelle

        listaCartelle.forEach(System.out::println);
    }
}
