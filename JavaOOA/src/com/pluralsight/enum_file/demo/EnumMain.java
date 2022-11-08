package com.pluralsight.enum_file.demo;

import com.pluralsight.enum_file.Aircraft;
import com.pluralsight.enum_file.FlightRules;
import com.pluralsight.enum_file.TakeOffDistancingRules;
import com.pluralsight.enum_file.WakeTurbulence;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalTime.now;

public class EnumMain {
    public static void main(String[] args) {
        FlightRules flightRules = FlightRules.INSTRUMENT_FLIGHT_RULES;
        int value = extractMinSeparation(flightRules);
        System.out.println(value);
        System.out.println(flightRules.maxSeparation);
        flightRules.maxSeparation = 100;
        System.out.println(flightRules.maxSeparation);
        System.out.println(flightRules.getMinSeparation());

        System.out.println("-------------------------------");
        List<Aircraft> aircraft = List.of(
           new Aircraft("B737", WakeTurbulence.LIGHT, 1000),
           new Aircraft("A320", WakeTurbulence.LIGHT, 1001),
           new Aircraft("A330", WakeTurbulence.MEDIUM, 1002),
           new Aircraft("ATR90", WakeTurbulence.LIGHT, 1003),
           new Aircraft("A380", WakeTurbulence.SUPER, 1004)
        );

        TakeOffDistancingRules takeOffDistancingRules = new TakeOffDistancingRules();

        int offset = 0;
        for (Aircraft a: aircraft) {
            offset += takeOffDistancingRules.calculateWaitTime(a);
            LocalDateTime time = LocalDateTime.now().plusSeconds(offset);
            System.out.println("Aircraft " + a.getModeADecimal() + " takes off at " + time.toLocalTime());
        }
        System.out.println("-------------------------");
        for (Aircraft a: aircraft) {
            offset += a.getWakeTurbulence().getTimeOffset();
            LocalDateTime time = LocalDateTime.now().plusSeconds(offset);
            System.out.println("Aircraft " + a.getModeADecimal() + " takes off at " + time.toLocalTime());
        }
    }

    static int extractMinSeparation(FlightRules fr) {
        return fr.getMinSeparation();
    }
}
