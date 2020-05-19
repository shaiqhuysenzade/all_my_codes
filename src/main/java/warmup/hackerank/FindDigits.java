package warmup.hackerank;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindDigits {
    // Complete the findDigits function below.
    static long findDigits(int n) {
        Integer number =n;
//        IntStream.of(n).filter(x->String.valueOf(n))
        String integerString = String.valueOf(n);
//        Stream.of(integerString).mapToInt(x->Character.getNumericValue(integerString.charAt(0)).
        long count1 = integerString.chars().mapToLong(c -> c).filter(x -> x != 0 && n % x == 0).count();
        return count1;
//        int count = 0;
//        for (int i = 0; i < integerString.length(); i++) {
//            int digit = Character.getNumericValue(integerString.charAt(i));
//            if (digit != 0 && n % digit == 0) {
//                count++;
//            }
//        }
//        return count;
    }

    public static void main(String[] args) {
        int number = 12;
        System.out.println(findDigits(number));
    }
}
