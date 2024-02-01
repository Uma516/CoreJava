package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {


        List<String> list= Arrays.asList("june","january","february","april","july","december");
        Stream<String>str=list.stream();

    }
}
