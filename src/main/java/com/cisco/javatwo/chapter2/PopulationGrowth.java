package com.cisco.javatwo.chapter2;

public class PopulationGrowth {
    public static void main(String[] args) {
        long polulation = 7800000000L;
        float growthRate = 1.2f;
        System.out.println("Estimated population for the next 5 years:");
        double calculatedPopulation = polulation + growthRate * polulation;
        for (int i = 0; i < 5; i++) {
            System.out.println(calculatedPopulation);
            calculatedPopulation = calculatedPopulation + growthRate * calculatedPopulation;
        }
    }
}
