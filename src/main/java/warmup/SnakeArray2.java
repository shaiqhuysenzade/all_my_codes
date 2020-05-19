package warmup;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SnakeArray2 {
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
        int i = 0;
        for (i = a[i].length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[j][i] + " ");
                }
            } else {
                for (int j = a.length - 1; j >= 0; j--) {
                    System.out.print(a[j][i] + " ");
                }
            }
        }
        System.out.println();
        System.out.println(snakeArray(a[0].length,a.length,a));
    }

    private static String snakeArray(int R, int C, int a[][]) {
        return IntStream.range(0,R*C).map(index->{
            int row =index/C;
            int shift=index-row*C;
            int col=(row&1)==0?C-1-shift:shift;
            return a[col][row];
        }).mapToObj(String::valueOf).collect(Collectors.joining(" "));

    }
}
