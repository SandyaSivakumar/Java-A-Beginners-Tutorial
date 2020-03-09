package com.cisco.javatwo.chapter9;

public class Shape
{
    private double height;
    private double width;

    // Set height and width
    public void setValues(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    //Get height
    public double getHeight()
    {
        return height;
    }

    //Get width
    public double getWidth()
    {
        return width;
    }
}