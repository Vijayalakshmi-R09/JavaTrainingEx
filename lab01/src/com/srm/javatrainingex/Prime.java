package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Prime {
	static Logger log=Logger.getLogger(Prime.class.getName());

	public static void main(String[] args) {
		var s= new Scanner(System.in);
		log.info("Enter a number: ");
		var n=s.nextInt();
		primeNo(n);
	}
	
		static void primeNo(int n)
		{
			var f=0;
			var a=true;
			f=n/2;
			if(n==0||n==1) 
			{
				log.info(n+" is not a Prime Number");
			}
			else
			{
				for(var i=2;i<=f;i++) 
				{
					if(n%i==0) 
					{
						log.info(n+"is not a Prime Number");
						a=false;
						break;
					}
				}
				if(a) {
					log.info(n+" ia a Prime Number");
				}
			}

	}

}
