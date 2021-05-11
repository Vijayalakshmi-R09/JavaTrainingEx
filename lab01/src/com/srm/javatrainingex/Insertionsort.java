package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Insertionsort {
	static Logger log=Logger.getLogger(Insertionsort.class.getName());

	static void insertSort(int[] arr, int n)
	{
		int temp;
		int j;
		int k;
		log.info("Array Elements After Insertion Sort");
		for(k=1; k<n; k++)   
	    {  
	        temp = arr[k];  
	        j= k-1;  
	        while(j>=0 && temp <= arr[j])  
	        {  
	            arr[j+1] = arr[j];   
	            j = j-1;  
	        }  
	        arr[j+1] = temp;  
	    }  
	    for(var i=0;i<n;i++)  
	    {  
	    	log.info(arr[i]+"");  
	    }  
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Insertion Sort");
		log.info("Enter size of array: ");
		var n=sc.nextInt();
		int[] arr= new int[n];
		log.info("Enter array elements: ");
		for(var i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}  
       insertSort(arr,n);  
	}
}
