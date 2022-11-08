package com.pluralsight.inheritance;

public class Airplane extends Aircraft{
    // Can access all non private members
    // from the base superclass
    private String wakeTurbulence;

    public int getSpeed() {
        return this.speed;
    }

    public int getAltitude() {
        return this.altitude;
    }

    public boolean isAvailable() {
        return this.available;
    }
}
