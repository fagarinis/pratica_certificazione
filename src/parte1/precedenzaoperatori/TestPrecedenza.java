package parte1.precedenzaoperatori;

public class TestPrecedenza {
    public static void main(String[] args) {

        boolean flag1= false;
        boolean flag2= true;
        boolean flag3= false;
        boolean flag4= true;



        boolean result;
        result = true != true == true; // != ha la precedenza

        System.out.println(result);
    }
}
