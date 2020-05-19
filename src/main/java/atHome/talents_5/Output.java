package atHome.talents_5;

public class Output {
    static int x = 3;

    class Inner1 {
        void inner1Method() {
            System.out.println("Salam" + x);
            System.gc();
        }
    }

    void outerMethod() {
        Output.x = 90;
        int x = 98;
        System.out.println("inside outerMethod");
        class Inner {
            void innerMethod() {
                System.out.println("x= " + x);
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}

class Main {
    public static void main(String[] args) {
        Output o = new Output();
        o.outerMethod();
        Output.Inner1 inner1 = new Output().new Inner1();
        inner1.inner1Method();
    }
}

