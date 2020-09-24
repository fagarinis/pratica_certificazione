package parte2.annotation;


@Developer(name = "john")
public class Persona {
    @CustomAnnotation(x = 2)
    public void print(){
        System.out.println("print");
    }
}
