package com.srm.javatrainingex;

import java.util.Scanner;

public class ArrIntersect {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of array1: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enetr the Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("The Array1: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the Size of array2: ");
		int n2=s.nextInt();
		int arr2[]=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<n;i++)
		{
			arr2[i]=s.nextInt();
		}
		System.out.println("The Array2: ");
		for(int a=0;a<n2;a++)
		{
			System.out.print(arr2[a]+" ");
		}
		System.out.println("\nIntersection of the two arrays: ");
		for(int i = 0; i<n; i++ ) {
	         for(int j = 0; j<n2; j++) {
	            if(arr[i]==arr2[j]) {
	               System.out.println(arr2[j]);
	            }
	         }
	      }

	}

}
