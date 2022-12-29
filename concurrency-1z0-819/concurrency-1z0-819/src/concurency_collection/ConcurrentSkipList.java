package concurency_collection;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipList {
    public static void main(String[] args) {
        System.out.println("ConcurrentSkipListSet and ConcurrentSkipListMap to replace " +
                "treeMap and treeSet that are not thread safe");
        Set<String> set = new ConcurrentSkipListSet<>();
        set.add("Tim");
        set.add("A");
        set.add("Pascal");
        set.add("a");
        set.add("Elias");
        for(String s : set) {
            System.out.println(s);
        }

        Map<String, String> map = new ConcurrentSkipListMap<>();
        map.put("Guitar","Jesse");
        map.put("Bass","Job");
        map.put("Piano","Sietske");
        for(String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
    }
}
