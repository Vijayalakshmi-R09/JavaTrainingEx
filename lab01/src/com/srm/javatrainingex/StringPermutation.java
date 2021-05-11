package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringPermutation {
	static Logger log=Logger.getLogger(StringPermutation.class.getName());

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.next();
        log.info("The Possible Permutations are: ");
        permute(str, 0, str.length() - 1);
	}
	static void permute(String s,int l,int r)
	{
		if (l == r)
		{
			log.info(s);
		}
		else 
		{
	        for (int i = l; i <= r; i++)
	        {
	            s = swap(s, l, i);
	            permute(s, l + 1, r);
	            s = swap(s, l, i);
	        }
		}
	}
	static String swap(String s1,int a,int b)
	{
		char t;
		char[] arr=s1.toCharArray();
		t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;
		return String.valueOf(arr);
	}
}
