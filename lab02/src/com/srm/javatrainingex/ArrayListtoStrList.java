package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayListtoStrList {
	static Logger log=Logger.getLogger(ArrayListtoStrList.class.getName());
	public static void main(String[] args) {
		var s = new Scanner(System.in);
		log.info("Enter the Size of array: ");
		var n=s.nextInt();
		ArrayList<String> arr=new ArrayList<>(n);
		log.info("Enter the Elements: ");
		for(var i=0;i<n;i++)
		{
			arr.add(s.next());
		}
		log.info("The ArrayList: "+arr);
		String[] array = new String[arr.size()];              
		for(var j =0;j<arr.size();j++)
		{
			  array[j] = arr.get(j);
		}
		log.info("String array: ");
		for(String k: array)
		{
			log.info(k+" ");
		}
	}

}
