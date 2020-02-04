package com.cisco.java.chapter3;
//Question6 - Write a class that uses for to print all even numbers from 1 to 9.
public class evenNumberOne {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 9; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Alternate method");
        for(i=2;i<=9;i=i+2)
        {
            System.out.println(i);
        }
    }
}
