package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class RemoveStr {
	static Logger log=Logger.getLogger( RemoveStr.class.getName());
	static void toRemoveChar(String s,int c)
	{
		log.info("The String after character removal: "+s.substring(0, c)+s.substring(c+1));
	}

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.nextLine();
        log.info("Enter the index of character to be removed: ");
        var c=sc.nextInt();
        toRemoveChar(str,c);
	}

}
