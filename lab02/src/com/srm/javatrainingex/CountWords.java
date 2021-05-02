package com.srm.javatrainingex;

import java.util.Scanner;

public class CountWords {
	static void wordCount(String s)
	{
		if(s==null || s.isEmpty())
		{
			System.out.println("Invalid...");
		}
		else {
		String[] words=s.split("\\s+");
		System.out.println("The Number of Words in given String is : "+words.length);
		} 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        wordCount(str);
	}
}
