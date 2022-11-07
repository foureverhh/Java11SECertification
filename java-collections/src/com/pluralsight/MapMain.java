package com.pluralsight;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {
        HashMap countries1 = new HashMap();
        HashMap<Integer, String> countries2 = new HashMap<>();
        var languages1 = new HashMap();
        Map<String, String> languages2 = new HashMap<>();
        countries2.put(840, "USA");
        countries2.put(484, "MEX");
        countries2.put(124, "CAN");
        System.out.println(countries2.get(840));
        countries2.remove(840);
        System.out.println(countries2.keySet());
        System.out.println(countries2.values());
        System.out.println(countries2.containsKey(840));
        System.out.println(countries2.containsValue("USA"));
        countries2.put(-1,null);
        countries2.put(null,null);
        System.out.println(countries2.keySet());
        System.out.println(countries2.values());
        System.out.println("-------------------------------");
        TreeMap<Integer, String> planets = new TreeMap<>();
        Map<String, String> englishSpanish = new TreeMap<>();
        planets.put(3, "Earth");
        planets.put(2, "Venus");
        planets.put(4, "Mars");
        englishSpanish.put("dog", "perro");
        englishSpanish.put("cat", "gato");
        englishSpanish.put("fish", "pez");
        System.out.println(planets.keySet());
        System.out.println(englishSpanish.keySet());
    }
}
