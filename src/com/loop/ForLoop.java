package com.loop;
public class ForLoop {


    public static void main(String[] args){
        String name="pinku";
        int a=name.length();
        String reverse="";
        for(int i=a-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);

    }


}

