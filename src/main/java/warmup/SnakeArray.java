package warmup;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SnakeArray {
    public static void main(String[] args) {
        int[][] a =
                {
                        {1, 2, 3},
                        {5, 6, 7},
                        {9, 10, 11},
                        {13, 14, 15},
                        {17, 18, 19},
                        {21, 22, 23},
                };
//        for (int i = 0; i < a.length * a[0].length; i++)
//            if (i % 2 == 0) {
//                System.out.print(a[i % a.length][i / a.length] + " ");
//            } else {
//                System.out.println(a[i % a.length][i / a.length]);
//            }
        int i = 0;
        while (i < a.length) {
            if(i%2==0){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j] + " ");
                }
            }else{
                for(int j=a[i].length-1;j>=0;j--){
                    System.out.print(a[i][j] + " ");
                }
            }
            i++;
        }
        System.out.println();
//        if(i%2==0){
//            System.out.println(Arrays.deepToString(a));
//        }else{
//            System.out.println(Arrays.deepToString(a));
//        }
//        System.out.println(Arrays.deepToString(a));
//        IntStream stream =   .flatMapToInt(x -> Arrays.stream(x));
//        stream.forEach(System.out::print);
        System.out.println();
    }
}
