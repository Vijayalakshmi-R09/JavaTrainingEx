package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class SecondLargNos {
	static Logger log=Logger.getLogger( SecondLargNos.class.getName());

	public static void main(String[] args) 
	{
		var sc=new Scanner(System.in);
		log.info("Enter the size of array");
		var s=sc.nextInt();
		int[] arr1=new int[s];
		log.info("Enter the elements:");
		for(var i=0;i<s;i++) {
			arr1[i]=sc.nextInt();
		}
		log.info("Array elements are: ");  
		for (var i=0; i<s; i++)   
		{  
			log.info(arr1[i]+" ");  
		}  
		log.info("\nSecond Largest Element: "+secondLargest(arr1,s));  
	
	}
		public static int secondLargest(int[] arr1,int l) 
		{
			int sum;
			for(var i=0;i<l;i++) {
				for(int j=i+1;j<l;j++) {
					if(arr1[i]>arr1[j])
					{
						sum=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=sum;
					}
				}
			}
			return arr1[l-2];
		}

}
