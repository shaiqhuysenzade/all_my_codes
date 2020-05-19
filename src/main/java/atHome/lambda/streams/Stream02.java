package atHome.lambda.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        IntStream.range(1, 4)
                .map(m ->
                {
                    System.out.print("This number is " + m + " ");
                    return
                            m * m + 1;
                })
                .forEach(System.out::println);

        Integer reduce = IntStream.range(1,5)
                .reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

        Arrays.stream(new int[]{1,2,3,4})
                .map(x->x*x)
                .average()
                .ifPresent(System.out::println);

        Stream.of(1.3,5.7)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);
    }
}
