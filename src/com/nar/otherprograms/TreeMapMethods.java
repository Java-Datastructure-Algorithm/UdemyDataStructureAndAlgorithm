package com.nar.otherprograms;

import java.util.TreeMap;

public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(5, "a");
        treeMap.put(10, "a");
        treeMap.put(15, "a");
        treeMap.put(16, "a");

        System.out.println("FloorKey of 7 : "+treeMap.floorKey(7));//Greatest key less than or equal to given key
        System.out.println("FloorKey of 5 : "+treeMap.floorKey(5));
        // Used for finding PhoneBook entry
    }
}
