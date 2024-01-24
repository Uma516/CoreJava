package com.funtionalinterface.Function;

import java.util.function.Function;

public class demo {
    public static void main(String[] args) {

        Function<Integer,Integer> f=(n)->{return n*n;};
            System.out.println(f.apply(2));
        System.out.println(f.apply(3));
        System.out.println(f.apply(5));


        
    }
}
