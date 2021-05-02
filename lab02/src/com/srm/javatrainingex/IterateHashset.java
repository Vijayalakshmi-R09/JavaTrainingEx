package com.srm.javatrainingex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class IterateHashset {

	public static void main(String[] args) {
	     HashSet<Integer> hset = new HashSet<Integer>();
	     hset.add(1);
	     hset.add(2);
	     hset.add(3);
	     hset.add(4);
	     hset.add(5);
	     System.out.println("The Hashset : "+hset);
	     System.out.println("iteration....");
	     Iterator<Integer> i = hset.iterator();
	     while(i.hasNext()){
	        System.out.println(i.next());
	     }
	  }
	}
