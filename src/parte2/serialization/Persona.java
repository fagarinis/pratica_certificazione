package parte2.serialization;

import java.io.*;

public class Persona implements Serializable {
    private String nome;
    private Integer eta;
    private transient String codiceFiscale; // se transient non viene serializzato

    public Persona(String nome, Integer eta, String codiceFiscale) {
        this.nome = nome;
        this.eta = eta;
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", codiceFiscale=" + codiceFiscale +
                '}';
    }

    public static void main(String[] args) throws Exception {
        Persona p = new Persona("Alessandra", 25, "SDHQUIWH");
        Persona.writePersona(p);
        Persona.readPersona("persona.ser");
    }

    public static void writePersona(Persona p) throws IOException {
        String fileName = "persona.ser";
        System.out.print("Writing on '" + fileName + "'...");
        System.out.println(p);
        File fileToWrite = new File(fileName);
        var oos = new ObjectOutputStream(new FileOutputStream(fileToWrite));
        oos.writeObject(p);
    }

    public static Persona readPersona(String fileName) throws IOException, ClassNotFoundException {
        System.out.print("Reading from '" + fileName + "'...");
        File file = new File(fileName);
        var ois = new ObjectInputStream(new FileInputStream(file));
        Persona result = (Persona) ois.readObject();
        System.out.println(result);
        return result;
    }
}
