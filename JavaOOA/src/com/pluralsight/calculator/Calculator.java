package com.pluralsight.calculator;

public class Calculator {
    static int foo = 0;
    int x = 0;
    private int w = 3;
    int getInnerX1() {
        return new Calculator.Distance().x1;
    }

    int getInnerFoo() {
        return Distance.foo;
    }

    public static class Distance {
        private int x1;
        private int y1;
        private int x2;
        private int y2;
        static int foo = 1;
        int x = 1;

        public Distance() {
            System.out.println("inner foo = " + Distance.foo + " , inner x = " + this.x);
            System.out.println("outer foo = " + Calculator.foo + " , outer x = " + new Calculator().x);
            System.out.println("outer private w = " + new Calculator().w);
        }

        public Distance(int x1, int y1, int x2, int y2) {
            this();
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

        public double calculate() {
            return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }

    }
}
