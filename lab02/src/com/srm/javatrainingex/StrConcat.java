package com.srm.javatrainingex;

import java.util.Scanner;

public class StrConcat {
	static void method1(String s,String s1)
	{
		String str=s+" "+s1;
		System.out.println("The concatination of 2 strings using '+' Operand: "+str);
	}
	static void method2(String s,String s1)
	{
		System.out.println("The concatination of 2 strings using concat() method: "+s.concat(s1));
	}

	public static void main(String[] args) {
		System.out.println("Enter string1: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter string2: ");
		String s1=sc.nextLine();
		method1(s,s1);
		method2(s,s1);
	}
}
