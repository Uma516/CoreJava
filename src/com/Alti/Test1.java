package com.Alti;

public interface Test1 {
    void t1();
    void t2();


}
 interface Test2{
    void t3();
    void t4();
}
class Test3 implements Test1,Test2 {

    @Override
    public void t1() {
        System.out.println("t1 method");
    }

    @Override
    public void t2() {
        System.out.println("t2 method");
    }

    @Override
    public void t3() {
        System.out.println("t3 method");

    }

    @Override
    public void t4() {
        System.out.println("t4 method");
    }
}


