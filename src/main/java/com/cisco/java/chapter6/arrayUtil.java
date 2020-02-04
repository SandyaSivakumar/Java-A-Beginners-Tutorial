package com.cisco.java.chapter6;

public class arrayUtil {
    public static int max(int[] numberList){
        int i;
        int maxValue = -1;
        for(i=0;i<numberList.length;i++)
        {
            if(numberList[i]>maxValue){
                maxValue=numberList[i];
            }

        }
        return maxValue;
    }

    public static int min(int[] numberList){
        int i;
        int minValue = 10000;
        for(i=0;i<numberList.length;i++)
        {
            if(numberList[i]<minValue){
                minValue=numberList[i];
            }

        }
        return minValue;
    }

}
