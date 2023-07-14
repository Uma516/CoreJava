package com.util;

public class Pro {
    public static void main(String[] args){
        System.out.println("hi");
        try {
            System.out.println(10 / 0);
        } catch(ArithmeticException ae){
            System.out.println(10/2);
        }
        System.out.println("welcome");
        System.out.println("good evening");
        System.out.println("good night");
        System.out.println("rest of the code");
    }
}
