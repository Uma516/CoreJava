package com.funtionalinterface;

public class Student1 {

    void m2(){
        System.out.println("welcome");
    }

    public static void main(String[] args) {

        TestInterface s=new Student1()::m2;
        s.m1();
    }
}
