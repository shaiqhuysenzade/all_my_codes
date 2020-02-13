package homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Integer> users_numbers = new ArrayList();
        //random number choosing by system
        int random_number = rn.nextInt(100);
        int count=0;
//        System.out.println(random_number);
        System.out.println("Let the game begin!");
        Scanner in = new Scanner(System.in);
        //name entry
        System.out.println("Enter your name,please: ");
        String name = in.nextLine();
        //create loop
        while (true) {
            System.out.println("Enter your number ");
            int number = in.nextInt();
            users_numbers.add(number);
            if (number == random_number) {
                count++;
                System.out.println("Congratulations, " + name);
                break;
            } else if (number < random_number) {
                count++;
                System.out.println("Your number is too small. Please, try again.");
            } else if (number > random_number) {
                System.out.println("Your number is too big. Please, try again.");
                count++;
            }
        }
        System.out.println(count);
        Collections.reverse(users_numbers);
        for (int i : users_numbers) {
            System.out.print("Your numbers are : "+i + " ");
        }
    }
}
