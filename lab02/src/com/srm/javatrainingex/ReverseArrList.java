package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseArrList {
	static Logger log=Logger.getLogger( ReverseArrList.class.getName());
	static void reverse(ArrayList<Integer> arr)
	{
		Collections.reverse(arr);
        log.info("the Reversed Array: "+Arrays.asList(arr));
	}

	public static void main(String[] args) {
		var s = new Scanner(System.in);
		log.info("Enter the Size of array: ");
		var n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<>(n);
		log.info("Enter the Elements: ");
		for(var i=0;i<n;i++)
		{
			arr.add(s.nextInt());
		}
		log.info("The Array: "+arr);
		reverse(arr);
	}
}
