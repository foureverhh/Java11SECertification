package com.pluralsight;

import java.util.HashSet;
import java.util.TreeSet;

public class SetMain {
    public static void main(String... args) {
        var a = 10;
        var b = 10;
        System.out.println(square(a, b));
        System.out.println("----------");
        HashSet<Integer> primeNumbers1 = new HashSet<>();
        TreeSet<Integer> primeNumbers2 = new TreeSet<>();
        primeNumbers1.add(71);
        primeNumbers1.add(61);
        primeNumbers1.add(41);
        primeNumbers1.add(1);

        primeNumbers2.add(71);
        primeNumbers2.add(61);
        primeNumbers2.add(41);
        primeNumbers2.add(1);

        primeNumbers1.forEach(System.out::println);
        System.out.println("-----------");
        primeNumbers2.forEach(System.out::println);

        System.out.println(primeNumbers1.add(5));
        System.out.println(primeNumbers1.add(5));

        primeNumbers1.remove(5);
        System.out.println(primeNumbers1.isEmpty());
        System.out.println(primeNumbers1.size());
    }


    static int square(int x, int y) {
        return x * y;
    }
}
