package com.util;

public interface Parent {
   int m1(char c);
   String m2(double d);
}
class Demo implements Parent {

    @Override
    public int m1(char c) {
        return 10;
    }

    @Override
    public String m2(double d) {
        return "hira";
    }
    public static void main(String[] args){
        Demo b=new Demo();
        b.m1('n');
        b.m2(2522252);
        int x=b.m1('m');
        System.out.println("return value="+x);
        String s=b.m2(52252255);
        System.out.println("return value="+s);
    }
}




