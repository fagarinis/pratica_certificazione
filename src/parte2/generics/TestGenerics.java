package parte2.generics;

public class TestGenerics {
    public static void main(String[] args) {
        Bottiglia b = new Bottiglia();
        b.contenuto = "sprite"; // generics infers to String type
        System.out.println(b.contenuto.getClass().getSimpleName());
        b.contenuto = 1;
        System.out.println(b.contenuto.getClass().getSimpleName());
    }
}
