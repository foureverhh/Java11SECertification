package com.pluralsight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class FlightPlan {
    String id;
    String departure;
    String destination;
    LocalDateTime departureTime;
    List<String> route;

    private FlightPlan() {
        System.out.println("FlightPlan");
        this.id = UUID.randomUUID().toString();
    }

    FlightPlan(String departure, String destination) {
        this();
/*
        if (departureTime == null || destination == null) {
            throw new IllegalArgumentException();
        }
*/
        System.out.println(String.format("FlightPlan( %s, %s)", departure, destination));
        this.departure = departure;
        this.destination = destination;
    }

    FlightPlan(String departure, String destination, LocalDateTime departureTime, List<String> route) {
        this(departure, destination);

  /*
        if (departureTime == null || destination == null) {
            throw new IllegalArgumentException();
        }
*/

        System.out.println(String.format("FlightPlan( %s, %s, %s, %s)",
                departure,
                destination,
                departureTime.toLocalTime(),
                route));

        this.route = route;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "FlightPlan{" +
                "id='" + id + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", route=" + route +
                '}';
    }
    public void print() {
        String msg = this.toString();
        System.out.println(msg);
    }
}
