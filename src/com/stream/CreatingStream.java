package com.stream;

import java.util.HashMap;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        Stream<Integer>stream=Stream.of(new Integer[]{1,2,3,4,5});

        stream.sorted().filter(n->n%2!=0).forEach(System.out::println);
    }
}
