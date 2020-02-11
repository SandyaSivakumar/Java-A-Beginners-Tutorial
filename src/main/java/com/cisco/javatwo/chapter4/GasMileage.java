package com.cisco.javatwo.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GasMileage {
    public float mileage(int miles,int gallons){
        return (float)miles/gallons;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GasMileage gasMileage = new GasMileage();
        System.out.println("Enter number of entries");
        int numOfEntries = scanner.nextInt();
        List mileageList = new ArrayList();
        for(int i=0;i<numOfEntries;i++){
            int miles = scanner.nextInt();
            int gallons = scanner.nextInt();
            float mileageValue = gasMileage.mileage(miles,gallons);
            System.out.println("Mileage for trip "+(i+1)+": "+mileageValue);
            mileageList.add(mileageValue);

        }
        float sum=0;
        for(int i=0;i<numOfEntries;i++){
            sum = sum + (float)mileageList.get(i);
        }
        System.out.println("Average Mileage: "+sum/numOfEntries);

    }
}
