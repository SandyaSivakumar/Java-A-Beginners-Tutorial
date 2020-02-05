package com.cisco.java.chapter10;

/*
Create an interface named Calculator in with three methods, add,
subtract and multiply. All methods take two int arguments and return a long.

Write an implementation of Calculator called ScientificCalculator and
implement all the methods.
 */

public class ScientificCalculator implements Calculator{
    @Override
    public long add(int number1, int number2){
        return number1+number2;
    }
    @Override
    public long subtract(int number1, int number2){
        return number1-number2;
    }
    @Override
    public long multiply(int number1, int number2){
        return number1*number2;
    }
    public static void main(String[] args){
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(scientificCalculator.add(15,25));
        System.out.println(scientificCalculator.subtract(40,32));
        System.out.println(scientificCalculator.multiply(10,10));
    }
}
