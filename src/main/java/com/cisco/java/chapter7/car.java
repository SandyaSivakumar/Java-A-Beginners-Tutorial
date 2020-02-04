package com.cisco.java.chapter7;

public class car {
    public void run(){
        car carObj = new car();
        System.out.println(carObj.toString());
    }

    @Override
    public String toString() {
        return "Inside class Car";
    }
}
