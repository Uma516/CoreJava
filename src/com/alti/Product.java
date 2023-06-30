package com.alti;

public class Product {

}
class Test extends Product{

}
class Demo extends Test{
    public static void main(String[] args){
       Object o =new Object();
        Product p=new Product();
        Test t=new Test();
        Demo d=new Demo();
        System.out.println(p instanceof Test);
        System.out.println(d instanceof Test);
        System.out.println(d instanceof Product);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Product);
    }
}



