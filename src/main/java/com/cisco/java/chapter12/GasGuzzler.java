package com.cisco.java.chapter12;

public class GasGuzzler extends Car {
    public GasGuzzler(String name){
        this.name = name;
        this.fuelEfficiency = FuelEfficiency.GAS_GUZZLER;
    }
}
