package com.pluralsight.inheritance.helcopter;

import com.pluralsight.inheritance.Aircraft;

public class Helicopter extends Aircraft {
    // Can access all non private members
    // from the base superclass
    private String wakeTurbulence;

    public int getSpeed() {
        return this.speed;
    }

    public int getAltitude() {
        return this.altitude;
    }
/*
   // package private not accessible for subclass in another package
    public boolean isAvailable() {
        return this.available;
    }
 */

    @Override
    public void land() {
        super.land();
        System.out.println("Helicopter landing");
    }
}
