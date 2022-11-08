package com.pluralsight;

public class FuelCalculatorMain {
    public static void main(String[] args) {
        int twoHourFlight = 120;
        int fuelNeeded = FuelCalculator.calculateNeed(120);
        System.out.println(fuelNeeded);
    }
}
