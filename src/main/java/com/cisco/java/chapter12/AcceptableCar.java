package com.cisco.java.chapter12;

public class AcceptableCar extends Car {
    public AcceptableCar(String name){
        this.name = name;
        this.fuelEfficiency = FuelEfficiency.ACCEPTABLE;
    }
}
