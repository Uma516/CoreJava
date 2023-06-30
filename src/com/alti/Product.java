package com.alti;

public class Product {
  void m1(int a){
      System.out.println("m1 method");
  }
}
class Test extends Product{
    void m1(String b,float f){
        System.out.println("child method");
    }
    public static void main(String[] args){
        Product p =new Product();
        Test t=new Test();
        t.m1("jon",1.5f);
        t.m1(10);
        
    }
}




