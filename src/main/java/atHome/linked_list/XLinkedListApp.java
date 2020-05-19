package atHome.linked_list;

import java.util.LinkedList;

public class XLinkedListApp {
    public static void main(String[] args) {
//        XLinkedList xl = new XLinkedList();
//        xl.prepend(1);
//        xl.prepend(2);
//        xl.prepend(3);//3,2,1
//        xl.append(10);
//        xl.append(20);
//        xl.append(13);//3,2,1,10,20,13
//        System.out.println(xl.represent());
//        System.out.println("Link 1 1 1 1 1"+xl.represent2());
//        System.out.println("The siz is " + xl.size());

        XLinkedList2 xl2 = new XLinkedList2();
        xl2.prepend(1);
        xl2.prepend(2);
        xl2.prepend(3);//3,2,1
        xl2.append(10);
        xl2.append(20);

        System.out.println("Loop representation : " + xl2.represent());
        System.out.println("Recursion representation : " + xl2.represent2());
        System.out.println("The size is " + xl2.size());
        System.out.println("The size is " + xl2.length_iter());
        System.out.println("The size is " + xl2.length_r());
        System.out.println("The size is " + xl2.length_tr());
        System.out.println("The size is " + xl2.contains(3));//true
        System.out.println("The size is " + xl2.contains(20));//true
        System.out.println("The size is " + xl2.contains(5));//false
        System.out.println("The size is " + xl2.contains_iteration(23));//false

    }
}
