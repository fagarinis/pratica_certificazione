package classi;

public class Parent {
    int eta = 55;

    public Parent() {
        System.out.println(getEta()); // il metodo getEta viene deciso a runtime >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
    }                                                                                                           //
                                                                                                                //
    public int getEta() {                                                                                       //
        return eta;                                                                                             //
    }                                                                                                           //
}                                                                                                               //
                                                                                                                //
class Child extends Parent {                                                                                    //
    int eta = 12;                                                                                               //
                                                                                                                //
                                                                                                                //
    public Child() {                                                                                            //
        // super(); implicito                                                                                   //
        // dopo viene settata eta = 12                                                                          //
    }                                                                                                           //
                                                                                                                //
    public int getEta() { // >> viene chiamato questo metodo ma eta non è ancora a 0 !<<<<<<<<<<<<<<<<<<<<<<<<<<<
        return eta;
    }
}

class Test {
    public static void main(String[] args) {
        new Child();
    }
}


