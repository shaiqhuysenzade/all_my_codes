package atclass;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        Random random = new Random();
        int odd[] = new int[n];
        int even[] = new int[n];
        int array[]=new int[n*2];
        int i;
        for (i= 0; i <2* n; i++) {
            int r = (int)(Math.random()*100)+1;
            if (r % 2 == 0) {

                    even[i/2] = r;

            } else {
                    odd[i/2] = r;

            }

        }
        for (i = 0; i < even.length; i++) {
                System.out.print(even[i] + " ");
        }
        System.out.println();
        for (i = 0; i < odd.length; i++) {
                System.out.print(odd[i] + " ");
        }
        System.out.println();
//        for(i=0;i<n;i++){
//            if(even[i/2]!=0 && odd[i/2]!=0) {
//                array[i / 2] = even[i/2];
//                System.out.print(array[i/2] + " ");
//                i++;
//                array[i/2] =odd[(i--)/2];
//                System.out.print(array[i/2] + " ");
//                }
//        }
        for (int j = 0,index = 0; j < array.length ; j = j + 2,index++ ) {
            array[j] = even[index];
            array[j+1] = odd[index];
        }
        System.out.println(Arrays.toString(array));
    }
}


