package homeworks;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Random rn = new Random();
        //random number choosing by system
        int random_number = rn.nextInt(100);
        System.out.println(random_number);
        System.out.println("Let the game begin!");
        Scanner in = new Scanner(System.in);
        //name entry
        System.out.println("Enter your name,please: ");
        String name = in.nextLine();
        //create loop
        for (int i = 0; ; i++) {
            System.out.println("Enter your number ");
            int number = in.nextInt();
            if (number == random_number) {
                System.out.println("Congratulations, " + name);
                break;
            } else if (number < random_number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (number > random_number) {
                System.out.println("Your number is too big. Please, try again.");
            }
        }
    }
}
