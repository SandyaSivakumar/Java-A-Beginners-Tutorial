package com.cisco.javaone.chapter3;

/*
Write a class that uses for to print all even numbers between two integers, a and b,
including b if b is an even number in descending order
 */

import java.util.Scanner;

public class EvenNumberDescendingOrder {
    public static void main(String[] args)
    {
        int iter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for a and b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (iter = b; iter >= a; iter--) {
            if (iter % 2 == 0) {
                System.out.println(iter);
            }
        }
    }
}
