package atHome.lambda.functional_interface;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class FunctionalInterface02 {
    public static void main(String[] args) {


        BiFunction<String, String, String> sbf = (s1, s2) -> s1 + s2;
        BiFunction<String, String, String> sbf1 = String::concat;
        String sentence = sbf.apply("Shaiq ", "Salam ");
        System.out.println(sentence);

        Consumer<String> stringConsumer = name -> System.out.println("Hello , " + name);
        for(String name : Arrays.asList("Shaiq","Vagif","Vusal","Cavidan")){
            stringConsumer.accept(name);
        }
        ShaigsInterface sI= System.out::println;
        sI.myMessege("Good evening");
    }
    @FunctionalInterface
    interface ShaigsInterface{
        void myMessege(String s);
    }
}
