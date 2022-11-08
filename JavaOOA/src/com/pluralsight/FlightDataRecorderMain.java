package com.pluralsight;

import java.time.LocalDateTime;

public class FlightDataRecorderMain {
    public static void main(String[] args) {
        FlightDataRecorder.PublicEntry publicEntry = new FlightDataRecorder.PublicEntry(LocalDateTime.now(),"hello world");
    }
}
