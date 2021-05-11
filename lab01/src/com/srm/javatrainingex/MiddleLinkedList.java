package com.srm.javatrainingex;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Logger;

public class MiddleLinkedList {
	static Logger log=Logger.getLogger(MiddleLinkedList.class.getName());

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
		 int middle = l.get(l.size()/2);
		 log.info("Middle Element: " + middle);
	}

}
