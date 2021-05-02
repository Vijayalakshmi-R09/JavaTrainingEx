package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedlisttoArraylist {

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
	     List<Integer> aList = new ArrayList<Integer>(l);
	     System.out.println("The ArrayList elements are: ");
	     for (Object i : aList) 
	     {
	         System.out.println(i);
	      }

	}

}
