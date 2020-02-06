package com.cisco.javatwo.chapter2;
import java.lang.Math;

public class SquaresAndCubes {
    public static void main(String[] args){
        System.out.printf("%10s %10s %10s","Number","Square","Cube");
        System.out.println();
        for(int i=1;i<=10;i++){
            System.out.printf("%10s %10s %10s",i,Math.pow(i,2),Math.pow(i,3));
            System.out.println();
        }
    }
}
