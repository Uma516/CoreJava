package com.util;

public interface Parent {
    void m1(int a);
    void m2(char c);
}
interface Parent1 extends Parent{
    void m1(float f);
    void m2(String str);
}
class Demo implements  Parent1,Parent{


    @Override
    public void m1(int a) {
        System.out.println("m1 method");
    }

    @Override
    public void m2(char c) {
System.out.println("m2 method");
    }

    @Override
    public void m1(float f) {
System.out.println("override method");
    }

    @Override
    public void m2(String str) {
System.out.println("override method");
    }
    public static void main(String[] args){
        Demo d=new Demo();
        d.m1(10);
        d.m1(1.5f);
        d.m2('v');
        d.m2("dia");
    }
}
