package com.srm.javatrainingex;

import java.util.Scanner;

public class RemoveStr {
	static void toRemoveChar(String s,int c)
	{
		
		System.out.println("The String after character removal: "+s.substring(0, c)+s.substring(c+1));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter the index of character to be removed: ");
        int c=sc.nextInt();
        toRemoveChar(str,c);
	}

}
