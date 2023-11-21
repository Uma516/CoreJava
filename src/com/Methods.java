package com;

import javax.imageio.stream.ImageInputStream;

public class Methods {
 static int m1(int id,float f){
     System.out.println(id);
     return 24;

    }

static String m2(String s,boolean b,long l){
    System.out.println(s);
    return "pinku";
}
static  float m3(char c,float t){
    System.out.println(t);
    return 200;
}

    public static void main(String[] args) {
       // Methods m=new Methods();
        Methods.m1(2,100);
        Methods.m2("heena",false,500000);
        Methods.m3('n',600);

    }
}
