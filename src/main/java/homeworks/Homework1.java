package homeworks;

import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        Random rn = new Random();
        //random number choosing by system
        int random_number = rn.nextInt(100);
        int count = 0;
        System.out.println(random_number);
        System.out.println("Let the game begin!");
        Scanner in = new Scanner(System.in);
        //name entry
        System.out.println("Enter your name,please: ");
        String name = in.nextLine();
        int[] arrayOfNumbers = new int[1000];
        //create loop
        int i = 0;
        while (true) {
            try {
                System.out.println("Enter your number ");
                String n = in.nextLine();
                int number = Integer.parseInt(n);
                count++;
                arrayOfNumbers[i] = number;
                i++;
                if (number == random_number) {
                    System.out.println("Congratulations, " + name);
                    break;
                } else if (number < random_number) {
                    System.out.println("Your number is too small. Please, try again.");
                } else if (number > random_number) {
                    System.out.println("Your number is too big. Please, try again.");
                }
            } catch (NumberFormatException n) {
                System.out.println("Please enter a number : ");
            }
        }
        System.out.println("Your input " + count + " numbers ");
        System.out.print("The numbers which you input is :  ");
        for (i = 0; i < arrayOfNumbers.length; i++) {
            int t = 0;
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] < arrayOfNumbers[j]) {
                    t = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = t;
                }
            }
        }
        //output in reverse order
        for (i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] != 0)
                System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}