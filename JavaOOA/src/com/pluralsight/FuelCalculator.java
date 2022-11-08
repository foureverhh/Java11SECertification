package com.pluralsight;

public class FuelCalculator {
    static final int AVG_LITERS_PER_SEC = 4;

    public static int calculateNeed(int durationMin) {
        int durationSec = durationMin * 60;
        return durationSec * AVG_LITERS_PER_SEC;
    }
}
