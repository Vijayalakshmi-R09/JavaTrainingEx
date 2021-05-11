package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class CountWords {
	static Logger log=Logger.getLogger( CountWords.class.getName());
	static void wordCount(String s)
	{
		if(s==null || s.isEmpty())
		{
			log.info("Invalid...");
		}
		else {
		String[] words=s.split("\\s+");
		log.info("The Number of Words in given String is : "+words.length);
		} 
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Enter the string: ");
        String str=sc.nextLine();
        wordCount(str);
	}
}
