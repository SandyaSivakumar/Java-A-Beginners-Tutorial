package com.cisco.java.chapter4;

public class tablet {
    private int weight;
    private float screenSize;
    private boolean wifiOnly;

    public tablet() {
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
        tablet tb = new tablet();
        tb.display();
        tb.setWifiOnly(true);
        tb.setScreenSize(15f);
        tb.setWeight(1);
        tb.display();

    }
}
