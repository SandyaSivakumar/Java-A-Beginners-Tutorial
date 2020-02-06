package com.cisco.javatwo.chapter2;

import java.util.Scanner;
import java.lang.Math;

public class CalculateApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number");
        int number3 = scanner.nextInt();

        System.out.println("Sum: "+(number1+number2+number3));
        System.out.println("Product: "+(number1*number2*number3));
        System.out.println("Average: "+((number1+number2+number3)/3));

        System.out.println("Maximum: "+Math.max(Math.max(number1,number2),number3));
        System.out.println("Minimum: "+Math.min(Math.min(number1,number2),number3));

    }
}
