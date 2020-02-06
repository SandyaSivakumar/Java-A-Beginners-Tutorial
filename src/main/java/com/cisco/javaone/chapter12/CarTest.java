package com.cisco.javaone.chapter12;

/*
Write an abstract Car class that has two fields, name (of type String) and
fuelEfficiency (of type FuelEfficiency given in Listing 12.4) and methods for calculating the minimum and maximum gas usage for a given distance (in miles).
Next, write three child classes, EfficientCar, AcceptableCar and GasGuzzler. The constructor of each of this suclasses takes a name and sets the fuelEfficiency field.
Finally, write a class to test it.

 */

public class CarTest {
    public static void main(String[] args){
        Car[] car = new Car[3];
        car[0] = new EfficientCar("Volkswagen");
        car[1] = new AcceptableCar("Hyundai");
        car[2] = new GasGuzzler("Mercedes");
        int distance = 170;
        for(Car carIter: car){
            System.out.printf("In a %s to drive %d miles, you need between %.2f and %.2f units of fuel",carIter.name,distance,carIter.calculateMinimumGasUsage(distance),carIter.calculateMaximumGasUsage(distance));
            System.out.println();
        }

    }
}
