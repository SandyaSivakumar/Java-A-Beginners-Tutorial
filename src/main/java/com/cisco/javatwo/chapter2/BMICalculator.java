package com.cisco.javatwo.chapter2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter weight in kilograms");
        float weight = scanner.nextFloat();
        System.out.println("Enter height in meters");
        float height = scanner.nextFloat();

        float bmi = weight/(height*height);
        System.out.println("BMI :"+bmi);
        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<25.0){
            System.out.println("Normal");
        }
        else if(bmi>=25 && bmi<30.0){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
