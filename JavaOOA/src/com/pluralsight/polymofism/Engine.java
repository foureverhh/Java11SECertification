package com.pluralsight.polymofism;

public interface Engine {
    int MIN_OPERATING_TEMP = 2;
    void start();
    void stop();

    default String healthCheck() {
        return "OK";
    }

    static boolean canStart(int outsideTemp) {
        return outsideTemp > MIN_OPERATING_TEMP;
    }
}
