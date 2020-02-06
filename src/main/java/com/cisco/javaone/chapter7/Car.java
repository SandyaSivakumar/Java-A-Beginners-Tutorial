package com.cisco.javaone.chapter7;

public class Car {
    public void run(){
        Car car = new Car();
        System.out.println(car.toString());
    }

    @Override
    public String toString() {
        return "Inside class Car";
    }
}
