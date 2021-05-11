package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Largestelementarr {
	static Logger log=Logger.getLogger(Largestelementarr.class.getName());
	static int findLargest(int[] arr)
	{
		int max=arr[0];
		for(var i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Enter the size of Array:");
		var n=sc.nextInt();
		int[] arr=new int[n];
		log.info("Enter the elements: ");
		for(var i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		log.info("The Array Elements are: ");
		for(var i=0;i<n;i++)
		{
			log.info(arr[i]+" ");
		}
		log.info("\nLargest element in given array is " + findLargest(arr));

	}

}
