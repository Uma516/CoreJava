package com.alti;

public class Product {
    Product(){
        System.out.println("default constructor");
    }
  void m1(int a) {
      System.out.println("m1 method");
  }
      void m2(char c){
      System.out.println("m2 method");
  }
}
class Test extends Product{
    Test(String str){
        System.out.println("one argument constructor");

    }
    void m1(int a){
        System.out.println("m1 method");
    }
    void m2(char c){
        System.out.println("m2 method");
    }
    public static void main(String[] args){
        Product p =new Product();
        Test t=new Test("LILLY");
        t.m2('v');
        t.m1(10);
        

    }
}




