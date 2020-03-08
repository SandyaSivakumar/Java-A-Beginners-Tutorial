package com.cisco.javatwo.chapter8;

public class Time2Test {
    public static void main(String args[]){
        Time2 time = new Time2();
        time.setTime(14,45,30);
        System.out.println(time.toUniversalString());
        System.out.println(time.toString());
    }
}
