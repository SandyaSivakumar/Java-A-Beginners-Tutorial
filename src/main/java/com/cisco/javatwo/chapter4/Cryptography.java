package com.cisco.javatwo.chapter4;


import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int number = scanner.nextInt();
        String numInString = Integer.toString(number);
        char[] list = numInString.toCharArray();
        System.out.println(list);
        int num = 0;
        for(int i=0;i<4;i++){
            num+=(((int)list[i]+7)%10)*Math.pow(10,4-i);
        }
        System.out.println(num);

    }
}
