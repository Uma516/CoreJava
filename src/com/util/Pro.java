package com.util;

public class Pro {
   void m1(ArithmeticException a){
       System.out.println("m1 method");
   }
   void m2(Exception e){
       System.out.println("m2 method");
   }
   void m3(){
       System.out.println("m3 method");
   }
   public static void main (String[] args){
      Pro p= new Pro();
       p.m1(new ArithmeticException());
       p.m2(new Exception());
       p.m3();
   }
}
