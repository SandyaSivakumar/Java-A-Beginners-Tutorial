package com.cisco.javaone.chapter5.test;

/*
Create a com.example.test.CarTest class to instantiate Car and print its field
values by calling the get methods
 */

import com.cisco.javaone.chapter5.Car;

public class CarTest {
    public static void main(String[] args){
        Car car = new Car(2017,"Volkswagon","Beetle");
        System.out.println("Year: "+car.getYear());
        System.out.println("Make: "+car.getMake());
        System.out.println("Model: "+car.getModel());
    }
}
