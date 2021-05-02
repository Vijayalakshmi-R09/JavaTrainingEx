package com.srm.javatrainingex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hashsort {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(500, "Book");
        hmap.put(1001, "Skulk");
        hmap.put(1004, "Zee");
        hmap.put(1002, "Xmas");
        hmap.put(1003, "Quiver");
        hmap.put(06, "Kite");
        hmap.put(1000, "Ribbon");
        
        System.out.println("SORT bY key....");

        System.out.println("Before Sorting:");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
              Map.Entry me = (Map.Entry)iterator.next();
              System.out.print(me.getKey() + ": ");
              System.out.println(me.getValue());
        }
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry)iterator2.next();
             System.out.print(me2.getKey() + ": ");
             System.out.println(me2.getValue());
        }
   }

}