package com.funtionalinterface;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {

        Predicate<String> p=str->str.length()>4;
        System.out.println("pinky");
        System.out.println("hashu");
        System.out.println("nikil");
        System.out.println("nil");
    }
}
