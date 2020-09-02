package parte2.enumtest;

enum Data {
    // questi enum vengono passati al costruttore Data(int number)
    INTERNAL(2) {
        int extract() { // Line 1 overrides default extract methods, otherwise can't be called
            return number++;
        }
    },
    EXTERNAL(2),
    DEFAULT(3);


    int number;

    Data(int number) {
        this.number = number;
    }


    int extract(){
        return 0;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Data.INTERNAL.extract()); // Line 2
    }
}
