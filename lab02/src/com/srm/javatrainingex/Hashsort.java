package com.srm.javatrainingex;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Logger;

public class Hashsort {
	static Logger log=Logger.getLogger(Hashsort.class.getName());
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(500, "Book");
        hmap.put(1001, "Skulk");
        hmap.put(1004, "Zee");
        hmap.put(1002, "Xmas");
        hmap.put(1003, "Quiver");
        hmap.put(06, "Kite");
        hmap.put(1000, "Ribbon");
        
        log.info("SORT bY key....");

        log.info("Before Sorting:");
        var set = hmap.entrySet();
        var iterator = set.iterator();
        while(iterator.hasNext()) {
              Entry<Integer, String> me = iterator.next();
              log.info(me.getKey() + ": ");
              log.info(me.getValue()+" ");
        }
        Map<Integer, String> map = new TreeMap<>(hmap); 
        log.info("After Sorting:");
        var set2 = map.entrySet();
        var iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
             Entry<Integer, String> me2 = iterator2.next();
             log.info(me2.getKey() + ": ");
             log.info(me2.getValue()+"");
        }
   }

}