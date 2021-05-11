package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Reversestrex9 {
	static Logger log=Logger.getLogger( Reversestrex9.class.getName());


	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.next();
        var rev=new StringBuilder();
        for(int i=str.length();i>0;i--) 
        {
        	var ch=str.charAt(i);
        	rev=rev.append(ch);
        }
        log.info("The Reversed string: "+rev);
	}
}
