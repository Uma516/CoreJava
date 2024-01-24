package com.methodrefernce;

public class Test3 {

   static void String(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {

        DemoInterface d=Test3::String;
        d.integer();
    }
}
