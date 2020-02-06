package com.cisco.javatwo.chapter2;

public class Pattern {
    public static void main(String[] args){
        int i;
        String pattern = "* * * * * * * * * * * * *";
        for(i=0;i<=6;i++){
            if(i%2==0){
                System.out.println(pattern);
            }
            else{
                System.out.print(" ");
                System.out.println(pattern);
            }
        }
    }
}
