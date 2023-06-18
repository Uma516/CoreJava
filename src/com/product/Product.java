package com.product;

public class Product {
    int proid=10;
    static String proName="ford";

    void getproid(){
        System.out.println(proid);
    }
    static void getproName(){
        System.out.println(proName);
    }
    Product(float a,boolean b){
        System.out.println("two arguemnt constructor");
    }
    static{
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String[] args){
        Product p=new Product(100,false);
        p.getproid();
        p.getproName();
    }
}
