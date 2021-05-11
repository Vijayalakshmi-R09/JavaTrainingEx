package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class NonRepeatchar {
	static Logger log=Logger.getLogger(NonRepeatchar.class.getName());

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.next();
	    for (var i = 0; i < str.length(); i++) 
	    {
	    	var unique = true;
	    	for (var j = 0; j < str.length(); j++) 
	    	{
	    		if (i != j && str.charAt(i) == str.charAt(j))
	    		{
	    			unique = false;
	    			break;
	    		}
	    	}
	    	if (unique)
	    	{
	    		log.info("The first non repeated character in String is: " + str.charAt(i));
			    break;
	    	}
	    }
	}
}
