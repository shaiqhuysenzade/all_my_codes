package homeworks;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "go to school";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "go to the pool";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "spend time with family";
        scedule[5][0] = "Friday";
        scedule[5][1] = "learning something new";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "spend time with friends";
        Scanner in = new Scanner(System.in);

        String s = "shaiq";
        for (; ; ) {
            System.out.println("Please, input the day of the week:");
            String input = in.nextLine();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            switch (input.toLowerCase()) {
                case "monday":
                    System.out.println(scedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println(scedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println(scedule[3][1]);
                    break;
                case "thursday":
                    System.out.println(scedule[4][1]);
                    break;
                case "friday":
                    System.out.println(scedule[5][1]);
                    break;
                case "saturday":
                    System.out.println(scedule[6][1]);
                    break;
                case "sunday":
                    System.out.println(scedule[0][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");

            }


        }


    }
}
