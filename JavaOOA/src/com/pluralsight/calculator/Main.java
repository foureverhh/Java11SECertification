package com.pluralsight.calculator;
import static com.pluralsight.calculator.ConversionHelper.*;
public class Main {
    public static void main(String[] args) {
        int altitudeInFeet = 28000;
        double distInNm = 10;

        int altitudeInFl = fromFeetToFL(300);
        System.out.println(altitudeInFeet + " ft -> FL " + altitudeInFl);

        double distInMeters = fromNmToMeters(distInNm);
        System.out.println(distInNm + " Nm -> " + distInMeters + " m.");

        Calculator.Distance distance = new Calculator.Distance(1,1,3,3);
        System.out.println(distance.calculate());
    }
}
