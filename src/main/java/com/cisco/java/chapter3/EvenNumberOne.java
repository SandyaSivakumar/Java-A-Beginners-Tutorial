package com.cisco.java.chapter3;

//Question6 - Write a class that uses for to print all even numbers from 1 to 9.

public class EvenNumberOne {
    public static void main(String[] args) {
        int iter;
        for (iter = 1; iter <= 9; iter++) {
            if (iter % 2 == 0) {
                System.out.println(iter);
            }
        }
        System.out.println("Alternate method");
        for(iter=2;iter<=9;iter=iter+2)
        {
            System.out.println(iter);
        }
    }
}
