package com.funtionalinterface;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> p=n-> n>20;
        System.out.println(p.test(20));
        System.out.println(p.test(30));
        System.out.println(p.test(40));
    }
}
