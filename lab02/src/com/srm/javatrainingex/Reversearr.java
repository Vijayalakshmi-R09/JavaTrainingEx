package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Reversearr {
	static Logger log=Logger.getLogger( Reversearr.class.getName());
	static void reverseArr(int[] arr)
	{
		int n1=arr.length;
		int i;
		int k;
		int t;
        for (i = 0; i < n1 / 2; i++) {
            t = arr[i];
            arr[i] = arr[n1 - i - 1];
            arr[n1 - i - 1] = t;
        }
        log.info("Reversed array is: \n");
        for (k = 0; k < n1; k++) {
        	log.info(arr[k]+"");
        }
		
	}

	public static void main(String[] args) {
		var s = new Scanner(System.in);
		log.info("Enter the Size of array: ");
		var n=s.nextInt();
		int[] arr=new int[n];
		log.info("Enetr the Elements: ");
		for(var i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		log.info("The Array: ");
		for(var i=0;i<n;i++)
		{
			log.info(arr[i]+" ");
		}
		reverseArr(arr);
	}

}
