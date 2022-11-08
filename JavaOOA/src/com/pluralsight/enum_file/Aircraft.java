package com.pluralsight.enum_file;

public class Aircraft {
    private final String model;
    private final WakeTurbulence wakeTurbulence;
    private final int modeADecimal;

    private  int altitudeFl;

    private  boolean isRvsmCapable;

    public Aircraft(String model, WakeTurbulence wakeTurbulence, int modeADecimal) {
        this.model = model;
        this.wakeTurbulence = wakeTurbulence;
        this.modeADecimal = modeADecimal;
    }

    public Aircraft(String model, WakeTurbulence wakeTurbulence, int modeADecimal, int altitudeFl, boolean isRvsmCapable) {
        this(model,wakeTurbulence,modeADecimal);
        this.altitudeFl = altitudeFl;
        this.isRvsmCapable = isRvsmCapable;
    }

    private class VerticalSeparation {
        private final int separationInFeet;

        public VerticalSeparation() {
            if (altitudeFl >= 290 && altitudeFl <= 410 && isRvsmCapable) {
                separationInFeet = 100;
            } else {
                separationInFeet = 2000;
            }
        }

        public int getSeparationInFeet() {
            return separationInFeet;
        }
    }

    public String getModel() {
        return model;
    }

    public WakeTurbulence getWakeTurbulence() {
        return wakeTurbulence;
    }

    public int getModeADecimal() {
        return modeADecimal;
    }

    public int getAltitudeFl() {
        return altitudeFl;
    }

    public boolean isRvsmCapable() {
        return isRvsmCapable;
    }

    public int getSeparationFeet() {
        return new VerticalSeparation().separationInFeet;
    }
}
