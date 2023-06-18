package com;

import java.security.PublicKey;

public interface TestInterface {
    void g1();
    void g2();
}
interface TestInteface2{
    void g3();
    void g4();
}
abstract class Test1 implements TestInterface,TestInteface2{

    @Override
    public void g1() {
        System.out.println("g1 method");
    }

    @Override
    public void g2() {
        System.out.println("g2 method");

    }
}

class Test2 extends Test1{

    @Override
    public void g3() {
        System.out.println("g3 method");
    }

    @Override
    public void g4() {
    System.out.println("g4 method");
    }

}

 class Test{
    public static void main(String[] args){
        Test2 t=new Test2();
        t.g3();
        t.g4();
        t.g2();
        t.g1();
    }
}