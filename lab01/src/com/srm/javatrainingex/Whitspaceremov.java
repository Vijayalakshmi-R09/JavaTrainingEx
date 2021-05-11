package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Whitspaceremov {
	static Logger log=Logger.getLogger(Whitspaceremov.class.getName());

	public static void main(String[] args) 
	{
        var sc=new Scanner(System.in);
        log.info("Enter the string : ");
        String str=sc.nextLine();
        log.info("Original string:  "+str);
        String str2;
		str2 = str.replaceAll("\\s", ""); 
		log.info("After whitespace removal:  "+str2);
	}
}
