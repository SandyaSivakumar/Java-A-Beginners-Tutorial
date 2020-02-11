package com.cisco.javatwo.chapter4;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int numOfEmployees = scanner.nextInt();
        String[] nameList = new String[numOfEmployees];
        int[] hoursList = new int[numOfEmployees];
        int[] ratesList = new int[numOfEmployees];
        for(int i=0;i<numOfEmployees;i++){
            System.out.println("Enter the employee name");
            nameList[i] = scanner.next();
            System.out.println("Enter the number of hours");
            hoursList[i] = scanner.nextInt();
            System.out.println("Enter the hourly rates");
            ratesList[i] = scanner.nextInt();
        }

        for(int i=0;i<numOfEmployees;i++){
            if(hoursList[i]==40){
                System.out.println("Employee "+(i+1)+" Salary: "+(40*ratesList[i]));
            }
            else if(hoursList[i]>40){
                System.out.println("Employee "+(i+1)+" Salary: "+(40*ratesList[i]+(hoursList[i]-40)*(1.5*ratesList[i])));
            }
        }

    }
}
