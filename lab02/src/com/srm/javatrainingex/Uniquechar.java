package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Uniquechar {
	static Logger log=Logger.getLogger(Uniquechar.class.getName());
	static void checkUnique(String s) 
	{
		var count=1;
		for(var i=0;i<s.length();i++) 
		{
			for(var j=i+1;j<s.length();j++) 
			{
				if(s.charAt(i)==s.charAt(j)) 
				{
					count=0;
				}
			}
		}
		if(count==1)
		{
			log.info("The given string "+s+" has Unique Characters");
		}
		else
		{
			log.info("The given string "+s+" has duplicate characters");
		}
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.next();
        checkUnique(str);
	}

}
