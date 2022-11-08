package com.pluralsight.calculator;

public class ConversionHelper {
    private static final int METERS_IN_ONE_NM = 1852;

    public static int fromFeetToFL(int feet) {
        return feet / 100;
    }

    public static double fromNmToMeters(double nm) {
        return nm * METERS_IN_ONE_NM;
    }
}
