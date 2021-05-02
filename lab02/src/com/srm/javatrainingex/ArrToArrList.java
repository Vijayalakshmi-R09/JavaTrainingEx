package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrToArrList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enetr the Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("The Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		List<Integer> l=new ArrayList<Integer>();
		for (Integer a : arr)
		{
			l.add(a);
		}
		System.out.println("\nThe ArrayList: "+l);
	}

}
