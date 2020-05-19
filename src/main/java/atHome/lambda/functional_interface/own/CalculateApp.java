package atHome.lambda.functional_interface.own;

public class CalculateApp {
    public static void main(String[] args) {
        Calculate add = (c1, c2) -> c1 + c2;
        Calculate multiply = (m1, m2) -> m1 * m2;
        Calculate difference = (d1, d2) -> Math.abs(d1 - d2);
        Calculate divide =(d1,d2) -> (d2!=0 ? d1/d2 : 0);

        System.out.println("Adding : " + add.calc(4,7));
        System.out.println("Difference : " + difference.calc(4,7));
        System.out.println("Multiply : " + multiply.calc(4,7));
        System.out.println("Divide : " + divide.calc(21,7));
    }
}
