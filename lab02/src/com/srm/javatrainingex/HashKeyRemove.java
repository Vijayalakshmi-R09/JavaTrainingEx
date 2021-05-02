package com.srm.javatrainingex;

import java.util.HashMap;
import java.util.Map;

public class HashKeyRemove {

	private static void printMap(Map<String, Integer> mapData) {
		
        for(String str:mapData.keySet()) {
        	System.out.println(str);
        }
		
	}
	public static void main(String[] args) {
		
        Map < String, Integer > mapData = new HashMap < String, Integer > ();
        System.out.println("Hashamp Elements: ");
        mapData.put("Pen", 0001);
        mapData.put("Pencil", 1002);
        mapData.put("Mousepad", 1023);
        mapData.put("Helpkit", 0014);
        System.out.println("\nBefore Removing Key: ");
        printMap(mapData);
        mapData.remove("Mousepad");
        System.out.println("\nAfter Removing Key: ");
        printMap(mapData);
	}
}
