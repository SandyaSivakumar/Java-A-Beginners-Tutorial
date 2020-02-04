package com.cisco.java.chapter12;

abstract class car {
    public String name;
    FuelEfficiency fuelEfficiency;
    public double calculateMinimumGasUsage(int distance){
        int mpg = fuelEfficiency.getMin();
        return (double)(distance/mpg);
    }
    public double calculateMaximumGasUsage(int distance){
        int mpg = fuelEfficiency.getMax();
        return (double)(distance/mpg);
    }
    public String getName(){
        return this.name;
    }

}
