package com.srm.javatrainingex;

import java.util.Scanner;

public class CountOccur {
	static void countOccurence(String s)
	{
		int count[]=new int[256];
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			count[s.charAt(i)]++;
		}
		char ch[]=new char[l];
		for(int i=0;i<l;i++) {
			ch[i]=s.charAt(i);
			int c=0;
			for(int j=0;j<=i;j++)
			{
				if(s.charAt(i)==ch[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println("Number of Occurences of "+s.charAt(i)+" is: "+count[s.charAt(i)]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        System.out.println("\nGiven String: \n"+str);
        countOccurence(str);
        }
}
