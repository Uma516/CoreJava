package com.alti;

public class Product {
  void m1(int a) {
      System.out.println("m1 method");
  }
      void m2(char c){
      System.out.println("m2 method");
  }
}
class Test extends Product{
    void m1(int a){
        System.out.println("m1 method");
    }
    void m2(char c){
        System.out.println("m2 method");
    }
    public static void main(String[] args){
        Product p =new Product();
        Test t=new Test();
        t.m2('v');
        t.m1(10);
    }
}




