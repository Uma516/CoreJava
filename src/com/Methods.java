package com;

import javax.imageio.stream.ImageInputStream;

public class Methods {

    int m1(int id){
        id=10;
        System.out.println(id);
        return 5;
    }
    String m2(String b,int c,boolean a){
        b="jia";
        c=55;
        a=false;
        System.out.println(b);
        return "hi";
    }
    double m3(double e,String g){
        e=2002;
        g="nia";
        System.out.println(e);
        return 3000;

    }

    public static void main(String[] args) {
        Methods m=new Methods();
        m.m1(12);
        m.m2("kiara",12,true);
        m.m3(1000,"kite");

    }
}
