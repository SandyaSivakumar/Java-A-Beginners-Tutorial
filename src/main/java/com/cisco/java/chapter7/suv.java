package com.cisco.java.chapter7;

/*
Write a public com.example.transport.Car class that adds a public void method
called run and overrides toString().
run prints the return value of toString(). Write another public class called SUV in the same package.
SUV extends Car and overrides its run and toString methods.
The run class of SUV should print the return value of the parent’s toString method and its own toString method.
Next, add a main method in SUV that creates an SUV object and calls its run method.
 */

public class suv extends car {
    @Override
    public void run(){
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Inside class Suv";
    }

    public static void main(String[] args){
        suv suvObj = new suv();
        suvObj.run();
    }
}
