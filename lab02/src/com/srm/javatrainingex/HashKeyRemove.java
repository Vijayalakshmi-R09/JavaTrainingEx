package com.srm.javatrainingex;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class HashKeyRemove {
	static Logger log=Logger.getLogger(HashKeyRemove.class.getName());

	private static void printMap(Map<String, Integer> mapData) {
		
        for(String str:mapData.keySet()) {
        	log.info(str);
        }
		
	}
	public static void main(String[] args) {
		
        Map < String, Integer > mapData = new HashMap <> ();
        log.info("Hashamp Elements: ");
        mapData.put("Pen", 0001);
        mapData.put("Pencil", 1002);
        mapData.put("Mousepad", 1023);
        mapData.put("Helpkit", 0014);
        log.info("\nBefore Removing Key: ");
        printMap(mapData);
        mapData.remove("Mousepad");
        log.info("\nAfter Removing Key: ");
        printMap(mapData);
	}
}
