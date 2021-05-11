package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class ArrIntersect {
	static Logger log=Logger.getLogger(ArrIntersect.class.getName());
	public static void main(String[] args) {
		var s = new Scanner(System.in);
		log.info("Enter the Size of array1: ");
		var n=s.nextInt();
		int[] arr=new int[n];
		log.info("Enetr the Elements: ");
		for(var i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		log.info("The Array1: ");
		for(var i=0;i<n;i++)
		{
			log.info(arr[i]+" ");
		}
		log.info("\nEnter the Size of array2: ");
		var n2=s.nextInt();
		int[] arr2=new int[n];
		log.info("Enter the Elements: ");
		for(var i=0;i<n;i++)
		{
			arr2[i]=s.nextInt();
		}
		log.info("The Array2: ");
		for(var a=0;a<n2;a++)
		{
			log.info(arr2[a]+" ");
		}
		log.info("\nIntersection of the two arrays: ");
		for(var i = 0; i<n; i++ ) {
	         for(var j = 0; j<n2; j++) {
	            if(arr[i]==arr2[j]) {
	               log.fine(arr2[j]+"");
	            }
	         }
	      }

	}

}
