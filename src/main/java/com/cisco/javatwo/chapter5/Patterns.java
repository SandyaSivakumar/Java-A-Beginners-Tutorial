package com.cisco.javatwo.chapter5;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int length = scanner.nextInt();
        //first pattern
        for(int i=1;i<=length;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //second pattern
        for(int i=length;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //third pattern
        for(int i=1;i<=length;i++){
            for(int k=2*(length-i+1);k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //fourth pattern
        for(int i=length;i>=1;i--){
            for(int k=2*(length-i);k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
