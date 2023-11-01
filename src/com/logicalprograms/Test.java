package com.logicalprograms;

public interface Test {

    void m1();
    void m2();

}
class Test1 implements Test{
    void m3() {
        System.out.println("m3 method");

    }

    void m4() {
        System.out.println("m method");
    }

    @Override
    public void m1() {
        System.out.println("m1 method");

    }

    @Override
    public void m2() {
        System.out.println("m2 method");

    }
}
class Test2 extends Test1{
    void m5(){
        System.out.println("m5 method");
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        t.m1();
        t.m2();
        t.m3();
        t.m4();
        t.m5();
    }
}





