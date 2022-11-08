package com.pluralsight.inheritance;

public class Aircraft {
    private String modelId;
    protected int altitude, speed;
    boolean available;
    public void land() {
        System.out.println("Aircraft landing");
    }

    public void takeOff() {

    }
}
