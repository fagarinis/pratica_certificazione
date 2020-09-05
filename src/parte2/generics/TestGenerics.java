package parte2.generics;

public class TestGenerics {
    public static void main(String[] args) {
        Bottiglia bottiglia = new Bottiglia();
        bottiglia.contenuto = "sprite"; // generics infers to String type
        System.out.println(bottiglia.contenuto.getClass().getSimpleName());
        bottiglia.contenuto = 1;
        System.out.println(bottiglia.contenuto.getClass().getSimpleName());

        System.out.println(getParameterClassName(bottiglia));
    }

    public static <T> String getParameterClassName(T parameter){
        return parameter.getClass().getSimpleName();
    }
}
