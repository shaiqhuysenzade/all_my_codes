package warmup.hackerank;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareTheTriplets {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> points = new ArrayList<>();
        int point1 = 0;
        int point2 = 0;
        points.add(point1);
        points.add(point2);
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                point1++;
                points.set(0, point1);
            } else if (a.get(i) < b.get(i)) {
                point2++;
                points.set(1, point2);
            }
        }
        return points;

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(Collectors.joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
