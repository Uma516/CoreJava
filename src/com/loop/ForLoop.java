package com.loop;

public class ForLoop {
    static int sum=0;
    public static void main(String[] args){

    for (int a=1;a<=10;a++){
        if(a%2==0){
            sum=sum+a;
        }
        }
        System.out.println(sum);
    }
}
