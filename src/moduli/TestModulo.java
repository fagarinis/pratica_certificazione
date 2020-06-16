package moduli;

import java.sql.Connection;

public class TestModulo {

//    **********************************************
//    Formato comandi COMPILAZIONE
//    javac <options> <source files>

//    nelle <option> :
//    --module-source-path <module-source-path> il path radice su cui trovare i diversi moduli (di solito src)
//    --module <module-name>, -m <module-name> compila tutti i .java  del modulo specificato
//    -d <directory> specifica il nome della cartella dove mettere i file .class compilati
//    --module-path <path>, -p <path> specifica i path di eventuali moduli richiesti (requires) al modulo da compilare che sono già stati compilati



//    **********************************************
//    Formato comandi ESECUZIONE sui moduli per eseguire una classe con un main in un modulo
//    java [options] -m <module>[/<mainclass>] [args...]
//    java [options] --module <module>[/<mainclass>] [args...]

//    nelle [options] --module-path or -p rappresenta una lista di package contenenti moduli o path a moduli

    public static void main(String[] args) {
        Connection c;
    }
}
