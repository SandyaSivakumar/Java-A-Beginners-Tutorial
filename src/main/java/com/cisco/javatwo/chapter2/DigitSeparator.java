package com.cisco.javatwo.chapter2;

import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int rem;
        while (number != 0) {
            rem = number % 10;
            System.out.print(rem + " ");
            number = number / 10;
        }
    }
}
