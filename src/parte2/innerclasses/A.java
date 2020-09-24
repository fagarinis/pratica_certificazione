package parte2.innerclasses;

public class A {
    private Integer varA;
    private static Integer staticVarA;


    void methodA() {
        InnerClass b = new InnerClass();
        InnerClass b2 = new A().new InnerClass();

        StaticInnerClass c = new StaticInnerClass();
        StaticInnerClass c2 = new A.StaticInnerClass();

        InnerClassExtension d = new InnerClassExtension();
        InnerClass d2 = new InnerClassExtension();

        StaticInnerClassExtension e = new StaticInnerClassExtension();
        StaticInnerClass e2 = new StaticInnerClassExtension();

        StaticInnerClassLocalExtension f = new StaticInnerClassLocalExtension();
        StaticInnerClass f2 = new StaticInnerClassLocalExtension();

    }


    class InnerClass {
        private Integer varB;
//        private static Integer staticVarB; // compile error - inner class cannot have static declaration

        void methodB() {
            Integer x = varA;
            Integer y = staticVarA;
        }
    }

    static class StaticInnerClass {
        private Integer varC;
        private static Integer staticVarC;

        void methodC() {
//            Integer x = varA; // compile Error
            Integer y = staticVarA;
        }
    }


    class InnerClassExtension extends InnerClass {
        private Integer varB;
//        private static Integer staticVarB; // compile error - inner class cannot have static declaration

        void methodB() {
            Integer x = varA;
            Integer y = staticVarA;
        }
    }

    static class StaticInnerClassExtension extends StaticInnerClass {
        private Integer varB;
//        private static Integer staticVarB; // compile error - inner class cannot have static declaration

        void methodB() {
//            Integer x = varA; //  compile error
            Integer y = staticVarA;
        }
    }

    class StaticInnerClassLocalExtension extends StaticInnerClass {

        private Integer varB;
//        private static Integer staticVarB; // compile error - inner class cannot have static declaration

        void methodB() {
            Integer x = varA;
            Integer y = staticVarA;
        }
    }


}
