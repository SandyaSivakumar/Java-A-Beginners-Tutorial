package com.cisco.javaone.chapter4;

/*
Create a class whose fully-qualified name is com.example.Tablet to model an
Android tablet. The class must have three private fields, weight (int), screenSize (float) and wifiOnly (boolean).
Access to the fields must be through pairs of public get and set methods, i.e. getWeight/setWeight, getScreenSize/setScreenSize and getWifiOnly/setWifiOnly.
The class must also have one constructor, a no-argument constructor.
 */

public class Tablet {
    private int weight;
    private float screenSize;
    private boolean wifiOnly;

    public Tablet() {
        weight = 0;
        screenSize = 0.0f;
        wifiOnly = false;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isWifiOnly() {
        return wifiOnly;
    }

    public void setWifiOnly(boolean wifiOnly) {
        this.wifiOnly = wifiOnly;
    }

    public void display(){
        System.out.println("Weight: "+this.weight);
        System.out.println("Screen Size: "+this.screenSize);
        System.out.println("Wifi Availability: "+this.wifiOnly);

    }

    public static void main(String[] args){
        Tablet tablet = new Tablet();
        tablet.display();
        tablet.setWifiOnly(true);
        tablet.setScreenSize(15f);
        tablet.setWeight(1);
        tablet.display();

    }
}
