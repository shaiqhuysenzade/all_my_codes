package homeworks.homework13.menu;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println(title+":");
        return scanner.nextLine();
    }

    public static int requireNumber(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println(title+":");
        return scanner.nextInt();
    }
}
