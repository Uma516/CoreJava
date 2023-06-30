package com.alti;

public class Product {
    int a=10;
    int b=20;
}
class Product1 extends Product{
    int a=100;
    int b=200;
    void m1(int a,int b){
        System.out.println(a+b);
        System.out.println(super.a+super.b);
        System.out.println(this.a*this.b);
    }
    public static void main(String[] args){
        Product1 p=new Product1();
        p.m1(1000,2000);
        
    }
}




