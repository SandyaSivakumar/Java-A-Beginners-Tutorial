package com.cisco.javatwo.chapter4;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary form of the number");
        String binaryNumber = scanner.next();
        char[] charArray = binaryNumber.toCharArray();
        int sum=0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='1'){
                sum+=Math.pow(2,i);
            }
        }
        System.out.println("Decimal value = "+sum);
    }
}
