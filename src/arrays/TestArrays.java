package arrays;

import java.util.Arrays;

public class TestArrays {

    static int[] arr1 = new int[]{2, 0, -3, 123};
    static int[] arr2 = new int[]{2, 0, -3, 123};


    public static void main(String[] args) {

        //Compare
        System.out.println(executeTestCompare());

        //Mismatch
//        System.out.println(executeTestMismatch());

        //Var
//        System.out.println(executeTestVar());
    }

    /**
     * @return il compare tra gli elementi del primo mismatch, se li trova allora returna il compare tra le lunghezze
     */
    public static Object executeTestCompare() {
        return Arrays.compare(arr1, arr2);
    }

    /**
     * @return il primo indice trovato per il quale i due array differiscono, se non differiscono ritorna -1
     */
    public static Object executeTestMismatch() {
        return Arrays.mismatch(arr1, arr2);
    }

    public static Object executeTestVar() {
        var var = 5;
        return var;
    }


}
