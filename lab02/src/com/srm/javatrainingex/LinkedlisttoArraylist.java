package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class LinkedlisttoArraylist {
	static Logger log=Logger.getLogger( LinkedlisttoArraylist.class.getName());
	public static void main(String[] args) {
		 var s = new Scanner(System.in);
		 LinkedList<Integer> l = new LinkedList<>();
		 log.info("Enter the Size of LinkedList: ");
		 var n=s.nextInt();
		 log.info("Enter the Elements: ");
		 for(var i=0;i<n;i++)
		 {
			l.add(s.nextInt());
		 }
		 log.info("The LinkedList: "+l);
	     List<Integer> aList = new ArrayList<>(l);
	     log.info("The ArrayList elements are: ");
	     for (Object i : aList) 
	     {
	    	 log.info(i+"");
	      }

	}

}
