package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class CountOccur {
	static Logger log=Logger.getLogger(CountOccur.class.getName());
	static void countOccurence(String s)
	{
		int[] count=new int[256];
		int l=s.length();
		for(var i=0;i<l;i++)
		{
			count[s.charAt(i)]++;
		}
		char[] ch=new char[l];
		for(var i=0;i<l;i++) {
			ch[i]=s.charAt(i);
			var c=0;
			for(var j=0;j<=i;j++)
			{
				if(s.charAt(i)==ch[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				log.info("Number of Occurences of "+s.charAt(i)+" is: "+count[s.charAt(i)]);
			}
		}
	}

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Enter the string: ");
        String str=sc.next();
        log.info("\nGiven String: \n"+str);
        countOccurence(str);
        }
}
