package parte1.eccezioni;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEccezione {

    //Cosa stampa? 124FINALLY
    public static void main(String[] args) {
        try {
            find();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void find() throws Exception {
        try {
            System.out.print(1);
            throw new FileNotFoundException("FNF");
        } catch(FileNotFoundException ex) {
            System.out.print(2);
            throw new IOException("IO");
        } catch(IOException ex) {
            System.out.print(3);
            throw new Exception("EXP");
        } finally {
            System.out.print(4);
            throw new Exception("FINALLY");
        }
    }
}
