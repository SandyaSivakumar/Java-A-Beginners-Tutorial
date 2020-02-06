package com.cisco.javaone.chapter12;

public class AcceptableCar extends Car {
    public AcceptableCar(String name){
        this.name = name;
        this.fuelEfficiency = FuelEfficiency.ACCEPTABLE;
    }
}
