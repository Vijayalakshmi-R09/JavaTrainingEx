package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Squareroot {
	static Logger log=Logger.getLogger( Squareroot.class.getName());

	public static void main(String[] args) {
		log.info("Enter a number: ");  
		var sc = new Scanner(System.in);  
		var num = sc.nextInt();  
		log.info("The square root of "+num+ " : "+squareRoot(num));  
		}  
	public static double squareRoot(int n)   
	{  
		double t;  
		double s=n/2;  
		do   
		{  
			t=s;  
			s=(t+(n/t))/2;  
		}   
		while((t-s)!= 0);  
		return s;  
	}  
}
		