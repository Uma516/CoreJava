package com.util;

public interface Parent {
    void m1();
    void m2();
    void m3();

}
abstract class Pro implements Parent{
     public void m1(){
        System.out.println("m1 method");
     }

}
abstract class Pro1 extends Pro{
    public void m2(){
        System.out.println("m2 method");
    }
}
class Pro2 extends Pro1{

    @Override
    public void m3() {
        System.out.println("m3 method");
    }
    public static void main(String[] args){
        Pro2 p=new Pro2();
        p.m3();
        p.m2();
        p.m1();
    }
}
