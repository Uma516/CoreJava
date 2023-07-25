package com.util;

public class Prize {
  void m3(){
      System.out.println(10/0);
  }
  void m2(){
       m3();
  }
  void m1(){
      try{
          m2();
      }catch(ArithmeticException e){
          System.out.println("ArithematicException propagation.....");
      }

      }
      public static void main(String[] args){
      Prize p=new Prize();
      p.m1();

  }
}