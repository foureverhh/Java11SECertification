package com.pluralsight;

import java.util.*;

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
        colors.forEach(System.out::println);

        System.out.println("----------");
        colors.remove("orange");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);

        System.out.println("-----------");
        System.out.println("convert list to array");
        String[] colorsArray = colors.toArray(new String[0]);
        System.out.println(Arrays.toString(colorsArray));

        System.out.println("-------------");
        System.out.println("convert en array to list");

        String[] shapes = new String[] {"square", "circle", "triangle"};
        List<String> shapeAsList = Arrays.asList(shapes); //java.util.Arrays$ArrayList inner class in Arrays, can change element, but can not remove
        System.out.println(shapeAsList);
        System.out.println("--------------");
        System.out.println(colors.getClass().getName());
        System.out.println(shapeAsList.getClass().getName());
        System.out.println("----java.util.Arrays$ArrayList inner class in Arrays, can modify existing element, but can not remove or add-----");
        System.out.println(shapeAsList);
        shapeAsList.set(0, "round");
        System.out.println(shapeAsList);
        // shapeAsList.add("extra shape"); // add create exception
        // shapeAsList.remove(0);          // remove create exception
        System.out.println("-----List.of(array)------");
        List<String> shapeOfList = List.of(shapes); //Immutable list
        // shapeOfList.set(0,"round");
        // System.out.println(shapeOfList);
        // shapeOfList.add("extra shape");
        // System.out.println(shapeOfList);
        // shapeOfList.remove(0);
        // System.out.println(shapeOfList);
        System.out.println("----collections.addAll(targetList, sourceArray)-----");
        List<String> normalList = new ArrayList<>();
        Collections.addAll(normalList, shapes);
        normalList.set(0,"round");
        System.out.println(normalList);
        normalList.add("extra shape");
        System.out.println(normalList);
        normalList.remove(0);
        System.out.println(normalList);

        System.out.println("-------------------------------");
        System.out.println("---------  Linked List  --------");
        System.out.println("------- Queue interface  --------");
        LinkedList<String> orders = new LinkedList<>();
        orders.add("order 1");
        orders.add("order 2");
        orders.add("order 3");
        System.out.println(orders);
        orders.addFirst("order 4");
        orders.addLast("order 5");
        System.out.println(orders);
        orders.removeFirst();
        orders.removeLast();
        System.out.println(orders);

    }
}
