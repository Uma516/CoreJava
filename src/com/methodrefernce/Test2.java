package com.methodrefernce;

public class Test2 {
   void m1(){
       System.out.println("hello");
   }

    public static void main(String[] args) {



      DemoInterface1 t= (DemoInterface1) new Test2();
      t.m1();
    }
}
