package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrToArrList {
	static Logger log=Logger.getLogger( ArrToArrList.class.getName());
	public static void main(String[] args) {
		var s = new Scanner(System.in);
		
		log.info("Enter the Size of array: ");
		var n=s.nextInt();
		int[] arr=new int[n];
		log.info("Enter the Elements: ");
		for(var i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		log.info("The Array: ");
		for(var i=0;i<n;i++)
		{
			log.info(arr[i]+" ");
		}
		List<Integer> l=new ArrayList<>();
		for (Integer a : arr)
		{
			Collections.addAll(l, a);
		}
		log.info("\nThe ArrayList: "+l);
	}

}
