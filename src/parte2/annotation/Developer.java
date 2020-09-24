package parte2.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(Developers.class)
@interface Developer {
    String name();

    int age() default 0;
}

@interface Developers {
    Developer[] value() default {};
}
