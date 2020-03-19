package homeworks.homework2;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        int row;
        int column;
        char[][] square = new char[6][6];
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                square[i][j] = '-';
            }
        }
        Scanner in = new Scanner(System.in);

        Random r = new Random();
        int q = r.nextInt(5);
        int w = r.nextInt(5);
        do {
            System.out.println("Enter guess row from 1 to 5 :");
            row = in.nextInt();
            if (row > 5 || row < 1) {
                System.out.println("Enter only from 1 to 5 ");
            }
            System.out.println("Enter guess column from 1 to 5 : ");
            column = in.nextInt();
            if (column > 5 || column < 1) {
                System.out.println("Enter guess column : ");
            }
            square[q][w]='x';
            if(square[row][column]!=square[q][w]){
                square[row][column]='*';
                for(int i=1;i<=5;i++){
                    for(int j=1;j<=5;j++){
                        if(square[i][j]=='x'){
                            System.out.print(" - | ");
                        }else{
                            System.out.print(" " + square[i][j] + " | ");
                        }
                    }
                    System.out.println();
                }
            }else {
                System.out.println("You have won");
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 5; j++) {
                        System.out.print(" " + square[i][j] + " | ");
                    }
                    System.out.println();
                }
            }

        } while (square[row][column] != square[q][w]);
    }
}
