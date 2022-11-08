package com.pluralsight.enum_file;

public enum FlightRules {
    INSTRUMENT_FLIGHT_RULES(10,15),
    VISUAL_FLIGHT_RULES(20,25),
    SPECIAL_FLIGHT_RULES(15, 20);

    private int minSeparation;
    public int maxSeparation;
    FlightRules() {
    }

    FlightRules(int minSeparation, int maxSeparation) {
        this.minSeparation = minSeparation;
        this.maxSeparation = maxSeparation;
    }

    public int getMinSeparation() {
        return minSeparation;
    }
}
