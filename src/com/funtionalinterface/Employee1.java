package com.funtionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employee1 {
    public static void main(String[] args) {
        Predicate<Integer>p=new Employee()::t1;
        System.out.println(p.test(3));
        System.out.println(p.test(4));

    }
}

