package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class RemwhiteSpaces {
	static Logger log=Logger.getLogger( RemwhiteSpaces.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.nextLine();
        log.info("\nOriginal String: \n"+str);
        log.info("\nThe Given string after whitespaces removed: \n"+str.replaceAll("\\s",""));
	}
}
