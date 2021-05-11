package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringDuplicates {
	static Logger log=Logger.getLogger( StringDuplicates.class.getName());


	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.next();
        char[] s=str.toCharArray();
        var temp=1;
        for(var i=0;i<s.length;i++) 
        {
        	for(int j=i+1;j<s.length;j++)
        	{
        		if(s[i]==s[j]) {
        			log.info(s[i]+"");  
        			temp++;
        			break;
        		}
        	}
        }
    	if(temp==1) 
		{
    		log.info("No Duplicates..");
        }
    }
}

