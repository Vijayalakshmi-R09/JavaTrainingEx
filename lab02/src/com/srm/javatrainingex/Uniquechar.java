package com.srm.javatrainingex;

import java.util.Scanner;

public class Uniquechar {
	static void checkUnique(String s) 
	{
		int count=1;
		for(int i=0;i<s.length();i++) 
		{
			for(int j=i+1;j<s.length();j++) 
			{
				if(s.charAt(i)==s.charAt(j)) 
				{
					count=0;
				}
			}
		}
		if(count==1)
		{
			System.out.println("The given string "+s+" has Unique Characters");
		}
		else
		{
			System.out.println("The given string "+s+" has duplicate characters");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        checkUnique(str);
	}

}
