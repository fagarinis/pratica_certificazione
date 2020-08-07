package parte1.moduli;

import java.sql.Connection;

public class TestModulo {

//    **********************************************
//    Formato comandi COMPILAZIONE
//    javac <options> <source files>

//    nelle <option> :
//    --module-source-parte2.path <module-source-parte2.path> il parte2.path radice su cui trovare i diversi parte1.moduli (di solito src)
//    --module <module-name>, -m <module-name> compila tutti i .java  del modulo specificato
//    -d <directory> specifica il nome della cartella dove mettere i file .class compilati
//    --module-parte2.path <parte2.path>, -p <parte2.path> specifica i parte2.path di eventuali parte1.moduli richiesti (requires) al modulo da compilare che sono già stati compilati



//    **********************************************
//    Formato comandi ESECUZIONE sui parte1.moduli per eseguire una classe con un main in un modulo
//    java [options] -m <module>[/<mainclass>] [args...]
//    java [options] --module <module>[/<mainclass>] [args...]

//    nelle [options] --module-parte2.path or -p rappresenta una lista di package contenenti parte1.moduli o parte2.path a parte1.moduli

    public static void main(String[] args) {
        Connection c;
    }
}
