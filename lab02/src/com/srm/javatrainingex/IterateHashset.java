package com.srm.javatrainingex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;

public class IterateHashset {
	static Logger log=Logger.getLogger(IterateHashset.class.getName());
	public static void main(String[] args) {
	     HashSet<Integer> hset = new HashSet<>();
	     hset.add(1);
	     hset.add(2);
	     hset.add(3);
	     hset.add(4);
	     hset.add(5);
	     log.info("The Hashset : "+hset);
	     log.info("iteration....");
	     Iterator<Integer> i = hset.iterator();
	     while(i.hasNext()){
	    	 log.info(i.next()+"");
	     }
	  }
	}
