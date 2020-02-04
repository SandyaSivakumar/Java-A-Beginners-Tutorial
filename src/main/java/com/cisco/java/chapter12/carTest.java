package com.cisco.java.chapter12;

/*
Write an abstract Car class that has two fields, name (of type String) and
fuelEfficiency (of type FuelEfficiency given in Listing 12.4) and methods for calculating the minimum and maximum gas usage for a given distance (in miles).
Next, write three child classes, EfficientCar, AcceptableCar and GasGuzzler. The constructor of each of this suclasses takes a name and sets the fuelEfficiency field.
Finally, write a class to test it.

 */

public class carTest {
    public static void main(String[] args){
        car[] carObj = new car[3];
        carObj[0] = new efficientCar("Volkswagen");
        carObj[1] = new acceptableCar("Hyundai");
        carObj[2] = new gasGuzzler("Mercedes");
        int distance = 170;
        for(car carIter: carObj){
            System.out.printf("In a %s to drive %d miles, you need between %.2f and %.2f units of fuel",carIter.name,distance,carIter.calculateMinimumGasUsage(distance),carIter.calculateMaximumGasUsage(distance));
            System.out.println();
        }

    }
}
