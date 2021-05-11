package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Revstrex8 {
	static Logger log=Logger.getLogger( Revstrex8.class.getName());

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.next();
        log.info("reversal of the given string: "+reverse(str));		
	}
	static StringBuilder reverse(String s)
	{
		var rev=new StringBuilder();
		for(int i=s.length();i>0;i--)
		{
			var ch=s.charAt(i);
			rev=rev.append(ch);
		}
		return rev;
	}
}
