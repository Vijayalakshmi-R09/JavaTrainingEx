package com.srm.javatrainingex;

import java.util.Scanner;

public class SignedintTostr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value ");
		int n=s.nextInt();
		String str = String.valueOf(n);
	    System.out.println("String str = " + str);
	}
}
