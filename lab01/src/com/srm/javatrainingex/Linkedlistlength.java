package com.srm.javatrainingex;

import java.util.LinkedList;
import java.util.logging.Logger;


public class Linkedlistlength {
	static Logger log=Logger.getLogger(Linkedlistlength.class.getName());
	public static void main(String[] args) {
		  LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cashew");
	        list.add("Total");
	        list.add("200");
	        log.info("LinkedList:" + list);
	        log.info("The size of the linked list is: " 
	                                                + list.size());
	    }
}
