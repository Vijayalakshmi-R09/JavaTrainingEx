package com.srm.javatrainingex;

import java.util.Scanner;

public class VowelCount {
	static void vowelCnt(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("The number of vowels in given string is: "+count);
	}

	public static void main(String[] args) {
		System.out.println("Enter a string...");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		vowelCnt(s);
		

	}

}
