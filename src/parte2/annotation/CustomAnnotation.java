package parte2.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // annotation restriction
@Inherited
public @interface CustomAnnotation {
    int x();
}
