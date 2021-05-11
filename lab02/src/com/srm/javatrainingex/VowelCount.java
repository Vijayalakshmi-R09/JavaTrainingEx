package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class VowelCount {
	static Logger log=Logger.getLogger(VowelCount.class.getName());
	static void vowelCnt(String s)
	{
		var count=0;
		for(var i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
		}
		log.info("The number of vowels in given string is: "+count);
	}

	public static void main(String[] args) {
		log.info("Enter a string...");
		var sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		vowelCnt(s);
		

	}

}
