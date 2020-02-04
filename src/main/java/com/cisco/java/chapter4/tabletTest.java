package com.cisco.java.chapter4;

public class tabletTest {
    public static void main(String[] args){
        tablet tb = new tablet();
        System.out.println("ScreenSize: "+tb.getScreenSize());
        System.out.println("Weight: "+tb.getWeight());
        System.out.println("Wifi Availability: "+tb.isWifiOnly());
        tb.setWeight(2);
        tb.setScreenSize(13.5f);
        tb.setWifiOnly(true);
        System.out.println("ScreenSize: "+tb.getScreenSize());
        System.out.println("Weight: "+tb.getWeight());
        System.out.println("Wifi Availability: "+tb.isWifiOnly());


    }
}
