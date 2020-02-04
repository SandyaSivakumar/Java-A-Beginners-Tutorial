package com.cisco.java.chapter5.test;

import com.cisco.java.chapter5.car;

public class carTest {
    public static void main(String[] args){
        car carObj = new car(2017,"Volkswagon","Beetle");
        System.out.println("Year: "+carObj.getYear());
        System.out.println("Make: "+carObj.getMake());
        System.out.println("Model: "+carObj.getModel());
    }
}
