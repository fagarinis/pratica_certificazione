package classi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

abstract class Food {
    abstract double getCalories();
}

class JunkFood extends Food {
    double getCalories() {
        return 200.0;
    }

    public static void main(String[] args) {
        Method[] reflectedClass = JunkFood.class.getDeclaredMethods();
        for (Method method : reflectedClass) {
            int mod = method.getModifiers();
            System.out.println(mod);
        }
    }
}



