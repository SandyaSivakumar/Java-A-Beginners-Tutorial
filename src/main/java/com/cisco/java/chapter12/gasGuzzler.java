package com.cisco.java.chapter12;

public class gasGuzzler extends car {
    public gasGuzzler(String name){
        this.name = name;
        this.fuelEfficiency = FuelEfficiency.GAS_GUZZLER;
    }
}
