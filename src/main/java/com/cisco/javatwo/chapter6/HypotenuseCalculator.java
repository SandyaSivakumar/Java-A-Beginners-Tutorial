package com.cisco.javatwo.chapter6;

import java.util.Scanner;

public class HypotenuseCalculator {
    public double hypotenuse(double side1, double side2){
        double result = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HypotenuseCalculator hypotenuseCalculator = new HypotenuseCalculator();
        System.out.println("Enter side1 and side2 values:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        System.out.println("Hypotenuse value = :"+hypotenuseCalculator.hypotenuse(side1,side2));
    }
}
