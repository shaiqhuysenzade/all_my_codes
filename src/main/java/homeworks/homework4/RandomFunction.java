package homeworks.homework4;

import java.util.Random;

public class RandomFunction {
    //    Random random = new Random();
//    public int getRandom (){
//
//        return random.nextInt(101);
//    }
    public static void main(String[] args) {
        int number1 = 8;
        int numbre2 = 2;
        String operation = "*";
        if (operation == "+") {
            System.out.println("Result: " + (number1 + numbre2));
        }
        if (operation == "-") {
            System.out.println("Result: " + (number1 - numbre2));
        }
        if (operation == "*") {
            System.out.println("Result: " + (number1 * numbre2));
        }
        if (operation == "/" && numbre2 == 0) {
            System.out.println("You are trying to divide by zero.");
        }
        if (operation == "/" && numbre2 != 0) {
            System.out.println("Result: " + (number1 / numbre2));
        }
        if (operation == "%") {
            System.out.println("Result: " + (number1 % numbre2));
        }

    }
}

