package com.util;

public class Pro {
    public static void main(String[] args){
        System.out.println("ratan".charAt(2));
        System.out.println("rest of the code");
        try{
        System.out.println(10/0);}
        catch(ArithmeticException ae){
            System.out.println(10/2);
        }
    }
}
