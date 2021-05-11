package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;

public class SortarrListDes {
	static Logger log=Logger.getLogger(SortarrListDes.class.getName());

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
		log.info("The ArrayList: ");
		for(String k: arr)
		{
			log.info(k+" ");
		}
		Collections.sort(arr, Collections.reverseOrder());
		log.info("\nArrayList in descending order:");
		for(String k: arr)
		{
			log.info(k+" ");
		}

	}

}
