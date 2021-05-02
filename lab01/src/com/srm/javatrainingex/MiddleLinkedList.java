package com.srm.javatrainingex;

import java.util.LinkedList;
import java.util.Scanner;

public class MiddleLinkedList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 LinkedList<Integer> l = new LinkedList<Integer>();
		 System.out.println("Enter the Size of LinkedList: ");
		 int n=s.nextInt();
		 System.out.println("Enter the Elements: ");
		 for(int i=0;i<n;i++)
		 {
			l.add(s.nextInt());
		 }
		 System.out.println("The LinkedList: "+l);
		 int middle = l.get(l.size()/2);
     	 System.out.println("Middle Element: " + middle);
	}

}
