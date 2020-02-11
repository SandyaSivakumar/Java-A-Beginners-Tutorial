package com.cisco.javatwo.chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter account balance at the beginning of the month:");
        int balance = scanner.nextInt();
        System.out.println("Enter charges:");
        int charges = scanner.nextInt();
        System.out.println("Enter credit:");
        int credit = scanner.nextInt();
        System.out.println("Enter credit limit:");
        int creditLimit = scanner.nextInt();

        int newBalance = balance+charges-credit;
        if(newBalance>creditLimit){
            System.out.println("Credit Limit Exceeded");
        }
        else{
            System.out.println("New balance = "+newBalance);
        }
    }
}
