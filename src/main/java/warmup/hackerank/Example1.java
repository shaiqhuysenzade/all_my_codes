package warmup.hackerank;

import java.util.Arrays;

public class Example1 extends Example {


    public static void main(String[] args) {
        Example example1 = new Example();
        example1.setAddress("").setId(1).setName("Shaiq");
        System.out.println(example1.toString());
        int a[] = new int[2];
        int sum = Arrays.stream(a).sum();

    }



}
