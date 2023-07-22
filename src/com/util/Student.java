package com.util;

public interface Student {

    void m1();
    void m2();
}
interface Std1 extends Student{
    void m1();
    void m2();
    void m3();
}
class Test implements Student ,Std1{

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
System.out.println("m2 method");
    }

    @Override
    public void m3() {
System.out.println("m3 method");
    }
    public static void main(String[] args){
        Object o=new Object();
        Test t=new Test();
        t.m2();
        t.m1();
        t.m3();
        System.out.println(t instanceof Student);
        System.out.println(t  instanceof Std1 );
        System.out.println(t instanceof Object);

    }
}