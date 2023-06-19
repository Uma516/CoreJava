package com.Interface;

public interface Project{
    void v1();

    void v2();
}
interface Project2{
        void v2();
        void v3();
    }

class Test implements Project,Project2{

    @Override
    public void v1() {
        System.out.println("v1 method");

    }

    @Override
    public void v2() {
   System.out.println("v2 method");
    }

    @Override
    public void v3() {
        System.out.println("v3method");

    }
    public static void main(String[] args){
        Test t=new Test();
        t.v1();
        t.v2();
        t.v3();
    }
}