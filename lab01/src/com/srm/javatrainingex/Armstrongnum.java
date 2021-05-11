package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Armstrongnum {
	static Logger log=Logger.getLogger( Armstrongnum.class.getName());

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Enter the Number: ");
		var num=sc.nextInt();
		checkArmstrong(num);		
	}
	static void checkArmstrong(int n)
	{
		var r=0;
		int a; 
		int sum;
		sum=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			r=r+(a*a*a);
		}
		if(sum==r)
		{
			log.info(sum+" --> Armstrong number.");
		}
		else
		{
			log.info(sum+" --> Not Armstrong number.");
		}
	}

}
