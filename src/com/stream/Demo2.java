package com.stream;

import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {


        Stream<Integer>stream=Stream.iterate(2,n->n+1);
        stream.limit(5).filter(n->n%2!=0).forEach(System.out::println);
    }
}
