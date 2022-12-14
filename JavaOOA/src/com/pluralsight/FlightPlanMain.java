package com.pluralsight;

import java.time.LocalDateTime;
import java.util.List;

public class FlightPlanMain {
    public static void main(String[] args) {
        // Partial flight plan
        FlightPlan berlinToBucharest = new FlightPlan("BER", "OTP");
        berlinToBucharest.print();
        System.out.println("--------------------------------------------");
        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2020, 1,10,23,15),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
                );
        parisToLondon.print();
    }
}
