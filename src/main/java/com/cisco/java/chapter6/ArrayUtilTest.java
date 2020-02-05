package com.cisco.java.chapter6;

/*
Write a ArrayUtil class that contains two static methods,
min and max. Both methods receive an array of ints and returns the smallest largest element, respectively.
 */

public class ArrayUtilTest {
    public static void main(String[] args){
        int[] numberList = {3,4,6,8,1,4,9,0};
        System.out.println("Max value of list: "+ArrayUtil.max(numberList));
        System.out.println("Min value of list: "+ArrayUtil.min(numberList));
    }
}
