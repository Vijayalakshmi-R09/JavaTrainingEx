package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Palindrome {
	static Logger log=Logger.getLogger( Palindrome.class.getName());


	public static void main(String[] args) {
		var s=new Scanner(System.in);
		log.info("Enter a string: ");
		String str=s.nextLine();
		if(str.isEmpty()) {
			log.info("Empty string.\nPlease Enter a valid String...");
			String str1=s.nextLine();
			checkPalindrome(str1);
		}
		else 
		{
			checkPalindrome(str);
	    }
	}
	static void checkPalindrome(String s) 
	{
		    var rev=new StringBuilder();
			
			int l=s.length();
			for(int i=l-1;i>=0;i--) 
			{
				var ch=s.charAt(i);
				rev=rev.append(ch);
				
		    }
		if(s.equals(rev))
		{
			log.info(s+" is a Palindrome");
		}
		else
		{
			log.info(s+" is not a Palindrome");
		}
    }
}
