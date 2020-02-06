package com.cisco.javaone.chapter4;

/*
Create a TabletTest class in the package com.example.test and instantiate the Tablet class.
Print the value of the fields (by calling its get methods) right after instantiation. Then, set the field values and print them again.
 */

public class TabletTest {
    public static void main(String[] args){
        Tablet tablet = new Tablet();
        System.out.println("ScreenSize: "+tablet.getScreenSize());
        System.out.println("Weight: "+tablet.getWeight());
        System.out.println("Wifi Availability: "+tablet.isWifiOnly());
        tablet.setWeight(2);
        tablet.setScreenSize(13.5f);
        tablet.setWifiOnly(true);
        System.out.println("ScreenSize: "+tablet.getScreenSize());
        System.out.println("Weight: "+tablet.getWeight());
        System.out.println("Wifi Availability: "+tablet.isWifiOnly());


    }
}
