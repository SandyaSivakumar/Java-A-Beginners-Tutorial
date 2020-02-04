package com.cisco.java.chapter12;

public class acceptableCar extends car {
    public acceptableCar(String name){
        this.name = name;
        this.fuelEfficiency = FuelEfficiency.ACCEPTABLE;
    }
}
