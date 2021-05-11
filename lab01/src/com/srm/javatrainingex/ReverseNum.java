package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseNum {
	static Logger log=Logger.getLogger( ReverseNum.class.getName());

	public static void main(String[] args) {
		log.info("Enter the number: ");  
		var sc = new Scanner(System.in);  
		var num = sc.nextInt();  
		reverseNum(num);
	}
	static void reverseNum(int n)
	{
		var rev=0;
		int c;
		int a=n;
		while(a!=0)
		{
			c=a%10;
			rev=rev*10+c;
			a=a/10;
		}
		log.info("The Reversal of Number "+n+" --> "+rev);
	}

}
