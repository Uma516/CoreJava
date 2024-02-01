package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {


        List<String>list1=Arrays.asList("pinky","nani","pandu");
        List<String>list2=Arrays.asList("uma","golu","ji");
        Stream<String>stream1=list1.stream();
        Stream<String>stream2=list2.stream();
        Stream<String>stream=Stream.concat(stream2,stream1);
        List<String>list=stream.sorted().collect(Collectors.toList());
        System.out.println(list);


    }
}
