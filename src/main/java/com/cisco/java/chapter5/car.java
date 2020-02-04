package com.cisco.java.chapter5;

public class car {
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

    public car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }
}
