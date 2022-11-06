package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String... args) {
        ArrayList arrayList1 = new ArrayList();
        List arrayList2 = new ArrayList();
        Collection arrayList3 = new ArrayList();

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        System.out.println(colors);
        System.out.println("----------");
        colors.add(1,"orange");
        System.out.println(colors);
    }
}
