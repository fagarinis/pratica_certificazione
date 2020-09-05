package parte2.jdbc;

public class ForNameTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class x = Class.forName("parte2.jdbc.ForNameTest");
        ClassLoader cl = x.getClassLoader();
        System.out.println(x);
        System.out.println(cl.getName());
    }
}
