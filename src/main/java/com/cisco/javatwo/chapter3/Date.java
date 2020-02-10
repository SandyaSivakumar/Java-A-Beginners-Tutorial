package com.cisco.javatwo.chapter3;

public class Date {
    private static int year;
    private static int month;
    private static int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void displayDate(){
        System.out.println(Date.day+"/"+Date.month+"/"+Date.year);
    }
}
