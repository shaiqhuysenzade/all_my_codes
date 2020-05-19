package warmup.hackerank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BreakingRecords {
    static int[] breakingRecords(int[] scores) {
        final int firstPoint = scores[0];
        int breakPoints = (int) IntStream.range(0, scores.length).filter(m ->m > (m = firstPoint)).distinct().count();
        int breakPoints1 = (int) Arrays.stream(scores).filter(m -> m > (m = firstPoint)).distinct().count();
//        Arrays.stream(scores).filter(m -> m > firstPoint).distinct().count();
//       int x= (int)Arrays.stream(scores).filter(m->m>firstPoint).max();
        int leastPoints = (int) Arrays.stream(scores).filter(m -> m < firstPoint).distinct().count();
        return addToNewArray(breakPoints, leastPoints);
    }

    static int[] addToNewArray(int breakPoints, int leastPoints) {
        int breakingRecords[] = new int[]{breakPoints, leastPoints};
        return breakingRecords;
    }

    public static void main(String[] args) {
        int scores[] = new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        System.out.println(Arrays.toString(breakingRecords(scores)));

    }
}
