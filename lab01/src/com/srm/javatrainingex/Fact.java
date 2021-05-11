package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Fact {
	static Logger log=Logger.getLogger(Fact.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Enter the number: ");
		var num=sc.nextInt();
		int factr=factRecursive(num);
		int facti=factIterative(num);
		log.info("The fcatorial of "+num+" using Recursion: "+factr);
		log.info("The fcatorial of "+num+" using Iteration: "+facti);
	}
	static int factRecursive(int n)
	{
		if(n==1) 
		{
			return 1;
		}
		return n*factRecursive(n-1);
	}
	static int factIterative(int n)
	{
		var f=1;
		for(var i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}

}
