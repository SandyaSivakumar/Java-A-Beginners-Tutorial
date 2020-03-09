package com.cisco.javatwo.chapter9;

public class Polymorphism {
    public static void main(String[] args)
    {
        Shape shape;

        Rectangle rect = new Rectangle();
        shape = rect;
        shape.setValues(78, 5);

        System.out.println("Area of rectangle : " + rect.getArea());


        Triangle triangle = new Triangle();
        shape = triangle;
        shape.setValues(34,3);

        System.out.println("Area of triangle : " + triangle.getArea());
    }
}
