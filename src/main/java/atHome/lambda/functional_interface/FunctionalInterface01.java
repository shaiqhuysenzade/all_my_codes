package atHome.lambda.functional_interface;

import java.util.function.*;

public class FunctionalInterface01 {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = s -> s.length()<10;
        System.out.println(stringPredicate.test("Shaiqggggggggggggggggg"));

        Consumer<String> stringConsumer =s -> System.out.println(s.toUpperCase());
        stringConsumer.accept("Shaiq");

//        Function<Integer,Integer> integerStringFunction = Integer::valueOf;
        Function<Integer,String> integerStringFunction = integer -> Integer.toString(integer);
        System.out.println(integerStringFunction.apply(244446).length());

        Supplier<String> stringSupplier = () -> "The supplier does not take in argument but return ther result";
        System.out.println(stringSupplier.get());

        BinaryOperator<Integer> binaryOperator = (integer, integer2) -> integer+integer2;
        System.out.println(binaryOperator.apply(37,73));

        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        UnaryOperator<String> unaryOperator1 = String::toLowerCase;
        System.out.println(unaryOperator.apply("UnaryOperator takes in single argumanet and return it"));
        System.out.println(unaryOperator1.apply("UnaryOperator takes in single argumanet and return it"));
    }
}
