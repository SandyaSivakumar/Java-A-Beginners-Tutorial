package com.cisco.javaone.chapter5;

/*
Create a com.example.Car class that has these private fields: year (int), make
(String) and model (String). Make Car immutable by providing only get
methods. Fields are set by passing values to the constructor.
 */

public class Car {
    private int year;
    private String make;
    private String model;

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }
}
