package parte2.serialization;

import java.io.*;

public class Persona2 implements Externalizable {
    private String nome;
    private Integer eta;
    private transient String codiceFiscale; // se transient non viene serializzato

    public Persona2() {
    }

    public Persona2(String nome, Integer eta, String codiceFiscale) {
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
        Persona2 p = new Persona2("Alessandra", 25, "SDHQUIWH");
        Persona2.writePersona(p);
        Persona2.readPersona("persona2.ser");
    }

    public static void writePersona(Persona2 p) throws IOException {
        String fileName = "persona2.ser";
        System.out.print("Writing on '" + fileName + "'...");
        System.out.println(p);
        File fileToWrite = new File(fileName);
        var oos = new ObjectOutputStream(new FileOutputStream(fileToWrite));
        oos.writeObject(p);
    }

    public static Persona2 readPersona(String fileName) throws IOException, ClassNotFoundException {
        System.out.print("Reading from '" + fileName + "'...");
        File file = new File(fileName);
        var ois = new ObjectInputStream(new FileInputStream(file));
        Persona2 result = (Persona2) ois.readObject();
        System.out.println(result);
        return result;
    }

    @Override
    // superseeds writeObject of Serializable
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(this.nome);
        out.writeInt(this.eta);

    }

    @Override
    // superseeds readObject of Serializable
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.nome = in.readUTF();
        this.eta = in.readInt();
    }
}
