package com.cisco.javaone.chapter9;

/*
Write a class called RangeRandomGenerator that can generate random numbers
between two integers that you specify when instantiating the class.
 */

import java.util.concurrent.ThreadLocalRandom;
public class RangeRandomGenerator {
    private int lowerBound;
    private int upperBound;
    public RangeRandomGenerator(int lowerBound,int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        RangeRandomGenerator rangeRandomGenerator = new RangeRandomGenerator(70,120);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(rangeRandomGenerator.lowerBound, rangeRandomGenerator.upperBound) + " ");

        }
    }

}
