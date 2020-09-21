package parte2.generics;

import java.util.ArrayList;
import java.util.List;

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


    static <T> void testGenerics(List<? extends T> inputList){
        List<T> list = new ArrayList<>(inputList);


        List<? extends Number> listNumber = new ArrayList<Integer>();
    }

}
