package com.util;

public class Test {

    void m1(int a){
        System.out.println(10);
    }
    void m2(String str){
        System.out.println("john");
    }
  }
class Test1 extends Test{
    void m1(double k){
        System.out.println(10000);
    }
    void m2(float f){
        System.out.println(1.5f);
    }
    public static void main(String[] args){
        Test1 t=new Test1();
        t.m1(10000 );
        t.m1(10);
        t.m2("john");
        t.m2(1.5f);

    }
}