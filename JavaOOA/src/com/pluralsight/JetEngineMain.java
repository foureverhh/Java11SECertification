package com.pluralsight;

public class JetEngineMain {
    public static void main(String[] args) {
        JetEngine je1 = new JetEngine();
        JetEngine je2 = new JetEngine();

        System.out.println(je1.serialNumber);
        System.out.println(je2.serialNumber);
        System.out.println(JetEngine.currentModelNumber);
    }
}
