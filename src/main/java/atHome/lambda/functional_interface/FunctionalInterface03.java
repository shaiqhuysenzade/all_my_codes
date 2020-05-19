package atHome.lambda.functional_interface;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class FunctionalInterface03 {
    public static void main(String[] args) {
//        IntFunction<String> stringIntFunction = sf->Integer.toString(sf);
        IntFunction<String> sstringIntFunction = Integer::toString;
        System.out.println(sstringIntFunction.apply(34).concat(" - this number is 34"));

        UnaryOperator<String> stringUnaryOperator = "Hello"::concat;
        System.out.println(stringUnaryOperator.apply(" Shaiq"));

        Function<String,BigInteger> sbf= BigInteger::new;
        System.out.println(sbf.apply("123456789876543"));

        Consumer<String> consumer =System.out::println;
        consumer.accept("Consumer is running as method reference ...... ");


    }
}
