package com.pluralsight.enum_file;

public class Aircraft {
    private final String model;
    private final WakeTurbulence wakeTurbulence;
    private final int modeADecimal;

    public Aircraft(String model, WakeTurbulence wakeTurbulence, int modeADecimal) {
        this.model = model;
        this.wakeTurbulence = wakeTurbulence;
        this.modeADecimal = modeADecimal;
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
}
