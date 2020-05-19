package atHome.method;

public class MethodAction {
    public static void main(String[] args) {
        // Creating an instance of the class
        Test obj = new Test();
        obj.display();
        Test e=new Ex();
        e.display();

        // Calling the m1() method by the object created in above step.
        int i = obj.m1();
        System.out.println("Control returned after method m1 : " + i);

        // Call m2() method
        // obj.m2();
        int no_of_objects = Test.get();

        System.out.print("No of instances created till now : ");
        System.out.println(no_of_objects);
        Integer g = null;

        int p=8;
        h1(p);
        System.out.println(h1(p));
        System.out.println(absoluteValue(8));

    }
    public static int h1(int i) {
        return 30;
    }
    public static int absoluteValue(int i) {
        return (i < 0) ? i : -i;
    }

}
