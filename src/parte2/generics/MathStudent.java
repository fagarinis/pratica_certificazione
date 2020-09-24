package parte2.generics;

interface Subject {}

interface Student<T extends Subject> {
    void learn(T t);
}

class Math implements Subject {}

public class MathStudent<T extends Math> implements Student<T> {

    String name;

    MathStudent(String name){
        this.name = name;
    }

    @Override
    public void learn(T t) {

    }
}
