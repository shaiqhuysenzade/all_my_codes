package warmup.hackerank;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class TreesSolution {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        long min = Arrays.stream(apples).min().getAsInt();
        System.out.println(min);
        long count1= Arrays.stream(apples).map(c->c+a).filter(ap-> ap>=7 && ap<=10).count();
       long count2= Arrays.stream(oranges).map(c->c+b).filter(or-> or>=7 && or<=10).count();


        System.out.println(count1 + "\n" +count2);


    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }

}
