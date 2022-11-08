package com.pluralsight;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FlightDataRecorder {
    private String id;
    protected List<Entry> entries = new ArrayList<>();

    public FlightDataRecorder() {
        this.id = UUID.randomUUID().toString();
    }

    public void log(String msg) {
        entries.add(new Entry(LocalDateTime.now(), msg));
    }

    public String getId() {
        return this.id;
    }

    private static class Entry { //Fully fledged class, but we do not want to expose it
        private LocalDateTime dateTime;
        private String log;
        private Entry(LocalDateTime dateTime, String log) {
            this.dateTime = dateTime;
            this.log = log;
        }
    }

    public static class PublicEntry { //Fully fledged class, but we do not want to expose it
        private LocalDateTime dateTime;
        private String log;
        public PublicEntry(LocalDateTime dateTime, String log) {
            this.dateTime = dateTime;
            this.log = log;
        }
    }
 }
