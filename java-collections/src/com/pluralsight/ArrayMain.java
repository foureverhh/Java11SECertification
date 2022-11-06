package com.pluralsight;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] ids = new int[10];
        System.out.println(ids);
        System.out.println(ids[0]);

        String[] instruments = new String[10];
        System.out.println(instruments);
        System.out.println(instruments[0]);

        instruments = new String[] {"guitar", "drums", "bass"};
        System.out.println(instruments);
        System.out.println(instruments[0]);

        System.out.println("---------");
        Arrays.sort(instruments);
        for(String ins: instruments) {
            System.out.println(ins);
        }

        System.out.println("---------");
        Arrays.toString(instruments);

        int[] fibArray = new int[] {0,1,5,2,3,1,8,13};
        System.out.println(Arrays.binarySearch(fibArray,3)); //binary search only works on sorted array
        Arrays.sort(fibArray);
        System.out.println("---------");
        System.out.println(Arrays.toString(fibArray));
        System.out.println(Arrays.binarySearch(fibArray, 3));

        System.out.println("---------");
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {1,2,3,4,5};
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.compare(arr1,arr2));
        System.out.println(Arrays.mismatch(arr1,arr2));
        System.out.println("---------");

        arr1 = new int[] {0,1,2,3,4,5};
        arr2 = new int[] {1,2,3,4,5,6};
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.compare(arr1,arr2));
        System.out.println(Arrays.mismatch(arr1,arr2));
        System.out.println("---------");

        System.out.println(Arrays.toString(args));
        int[][] multiArray = new int[3][3];
    }
}
