package com.cisco.java.chapter10;

/*
Create an interface named Calculator in with three methods, add,
subtract and multiply. All methods take two int arguments and return a long.

Write an implementation of Calculator called ScientificCalculator and
implement all the methods.
 */

public class scientificCalculator implements calculator{
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
        scientificCalculator sc = new scientificCalculator();
        System.out.println(sc.add(15,25));
        System.out.println(sc.subtract(40,32));
        System.out.println(sc.multiply(10,10));
    }
}
