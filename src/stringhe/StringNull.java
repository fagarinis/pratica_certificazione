package stringhe;

public class StringNull {

    public static void main(String[] args) {
        String s = null;
        String t = null;


        String result = s + t; //la concatenazione di stringhe returna la stringa "null" se la stringa = null

//        System.out.println(s.length()); //NullPointerException
        System.out.println(result.length()); //8
    }
}
