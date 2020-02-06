package com.cisco.javatwo.chapter2;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args){
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();

        if(number1>number2){
            System.out.println(number1+" is larger");
        }
        else if(number2>number1){
            System.out.println(number2+" is larger");
        }
        else{
            System.out.println("These numbers are equal");
        }
    }
}
