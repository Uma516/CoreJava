package com.Alti;

public interface Test1 {
    void s1();
    void s2();
    void s3();
}
abstract class Test2 implements Test1{

    @Override
    public void s1() {
        System.out.println("s1 method");
    }

    @Override
    public void s2() {
        System.out.println("s2 method");
    }

}
class Test3 extends Test2{


    @Override
    public void s3() {
        System.out.println("s3 method");

    }

    public static void main(String[] args) {
        Test3 t= new Test3();
        t.s1();
        t.s2();
        t.s3();
    }
}


