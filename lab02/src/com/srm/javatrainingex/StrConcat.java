package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class StrConcat {
	static Logger log=Logger.getLogger(StrConcat.class.getName());
	static void method1(String s,String s1)
	{
		String str=s+" "+s1;
		log.info("The concatination of 2 strings using '+' Operand: "+str);
	}
	static void method2(String s,String s1)
	{
		log.info("The concatination of 2 strings using concat() method: "+s.concat(s1));
	}

	public static void main(String[] args) {
		log.info("Enter string1: ");
		var sc=new Scanner(System.in);
		String s=sc.nextLine();
		log.info("Enter string2: ");
		String s1=sc.nextLine();
		method1(s,s1);
		method2(s,s1);
	}
}
