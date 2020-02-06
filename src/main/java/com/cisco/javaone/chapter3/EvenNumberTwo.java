package com.cisco.javaone.chapter3;
import java.util.*;

/*
Write a class that uses for to print all even numbers between two integers, a and b,
including b if b is an even number
 */


public class EvenNumberTwo {
    public static void main(String[] args) {
        int iter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for a and b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (iter = a; iter <= b; iter++) {
            if (iter % 2 == 0) {
                System.out.println(iter);
            }
        }

    }
}
