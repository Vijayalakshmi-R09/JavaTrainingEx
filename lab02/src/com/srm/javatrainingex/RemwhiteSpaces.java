package com.srm.javatrainingex;

import java.util.Scanner;

public class RemwhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("\nOriginal String: \n"+str);
        System.out.println("\nThe Given string after whitespaces removed: \n"+str.replaceAll("\\s",""));
	}
}
