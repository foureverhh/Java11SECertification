package com.pluralsight;

import java.util.function.DoubleToIntFunction;

import static java.lang.Thread.sleep;

public class RadarMain {
    public static void main(String[] args) throws InterruptedException {
        RadarTarget os791 = new RadarTarget(
                "OS791",
                280,
                "B737-800");
        System.out.println(os791.getLabel());

        os791.changeAltitude(200);

        for (int i = 0; i < 10; i++) {
            sleep(500);
            System.out.println(os791.getLabel());
            System.out.println();
        }
    }
}
