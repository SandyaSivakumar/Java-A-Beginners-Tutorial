package com.cisco.javatwo.chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items:");
        int numOfItems = scanner.nextInt();
        System.out.println("Enter price of items:");
        float[] priceArray = new float[numOfItems];
        for(int i=0;i<numOfItems;i++){
            priceArray[i] = scanner.nextFloat();
        }

        float sum = 0.0f;
        for( int i=0;i<numOfItems;i++){
            sum+=priceArray[i];
        }

        System.out.println("Commission = "+(200+0.9*sum));
    }
}
