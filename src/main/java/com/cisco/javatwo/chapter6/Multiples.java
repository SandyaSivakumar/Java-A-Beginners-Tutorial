package com.cisco.javatwo.chapter6;

import java.util.Scanner;

public class Multiples {
    public boolean isMultiple(int number1, int number2){
        if(number2%number1==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Multiples multiples = new Multiples();
        System.out.println("Enter number1 and number2 values:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1+" is a factor of "+number2+" : "+multiples.isMultiple(number1,number2));
    }
}
