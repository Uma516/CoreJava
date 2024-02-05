package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {


       List<String>str=Arrays.asList("car","car","bus","bus","bike","bike","boat","boat");
       str.stream().distinct().forEach(System.out::println);
    }
}
