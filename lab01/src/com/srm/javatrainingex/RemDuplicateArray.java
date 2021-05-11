package com.srm.javatrainingex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class RemDuplicateArray {
	static Logger log=Logger.getLogger( RemDuplicateArray.class.getName());

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Enter size of array: ");
		var n=sc.nextInt();
		int[] arr= new int[n];
		log.info("Enter array elements: ");
		for(var i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int l=arr.length;  
		l=removeDuplicate(arr,l);
		log.info("\nArray after removing duplications ");
		for (var i=0; i<l; i++)  
		{
			log.info(arr[i]+" ");  
		}
}
	public static int removeDuplicate(int[] arr,int l)
	{
        int[] t =new int[l];
        var j=0;
        for (var i = 0; i < l-1; i++) 
        {
           if (arr[i] != arr[i+1])
           {
               t[j++]=arr[i];
           }
        }
        t[j++] = arr[l-1];     
        for (var i=0; i<j; i++)
        {  
            arr[i] = t[i];  
        }   
        return j; 
	}
}
