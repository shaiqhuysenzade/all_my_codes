package atHome.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        Arrays.asList("Banan", "Alma", "Mandarin", "Kivi")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("Natasha", "Yelena", "Nazim", "Mahir")
                .filter(f -> f.startsWith("N"))
                .forEach(s->System.out.println("Starts with N : " + s));

        System.out.println("-------------");

        List<String> collect = Stream.of("Java", "Scala")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
