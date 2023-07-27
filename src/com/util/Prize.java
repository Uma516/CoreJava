package com.util;

import java.util.Scanner;

public class Prize {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("print a number");
        int n = s.nextInt();
        try{
            System.out.println(10/0 );
            System.out.println("ratan".charAt(4));
        }catch(ArithmeticException|StringIndexOutOfBoundsException e){
            System.out.println("rest of the code");
        }
    }
}