package com.pluralsight;

public class JetEngine {
    String model;
    String maxThrust;
    int maxFanSpeed;
    int fanSpeed;
    String serialNumber;
    public static int currentModelNumber;

    {
        this.model = "";
        System.out.println("Initializer called");
    }

    JetEngine() {
        currentModelNumber++;
        this.serialNumber = String.format("%08d", currentModelNumber);
    }

    JetEngine(int maxFanSpeed) {
        this.maxFanSpeed = maxFanSpeed;
    }
}
