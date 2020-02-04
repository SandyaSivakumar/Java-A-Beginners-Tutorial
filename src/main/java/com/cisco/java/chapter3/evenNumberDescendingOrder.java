package com.cisco.java.chapter3;

import java.util.Scanner;

public class evenNumberDescendingOrder {
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (i = b; i >= a; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
