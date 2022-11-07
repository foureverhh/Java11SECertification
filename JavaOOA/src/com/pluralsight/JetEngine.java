package com.pluralsight;

public class JetEngine {
    String model;
    String maxThrust;
    int maxFanSpeed;
    int fanSpeed;

    {
        this.model = "";
        System.out.println("Initializer called");
    }
    JetEngine(int maxFanSpeed) {
        this.maxFanSpeed = maxFanSpeed;
    }

    public static void main(String[] args) {
        JetEngine jetEngine = new JetEngine(6000);
    }
}
