package com.util;

public class Test {
    int a=10;
    int b=20;
    void m1(){
        System.out.println("m1 method");
    }
}
class Test1 extends Test{
    int a=11;
    int b=12;
    void m2(){
        System.out.println("m2 method");
        System.out.println(super.a+super.b);
        System.out.println(this.a+this.b);
    }
    public static void main(String[] args){
        Test t1=new Test();
        Object o=new Test1();
        Test1 t=new Test1();
        t.m1();
        t.m2();
     System.out.println(t instanceof Test);
     System.out.println(t instanceof Object);
     System.out.println(t1 instanceof Object);
     System.out.println(o instanceof Test1);
     System.out.println(o instanceof Test);
    }
}

