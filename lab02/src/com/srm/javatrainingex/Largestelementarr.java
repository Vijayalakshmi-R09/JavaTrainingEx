package com.srm.javatrainingex;

import java.util.Scanner;

public class Largestelementarr {
	static int findLargest(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array Elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nLargest element in given array is " + findLargest(arr));

	}

}
