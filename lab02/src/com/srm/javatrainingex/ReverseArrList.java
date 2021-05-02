package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrList {
	static void reverse(ArrayList arr)
	{
		Collections.reverse(arr);
        System.out.println("the Reversed Array: "+Arrays.asList(arr));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		System.out.println("Enter the Elements: ");
		for(int i=0;i<n;i++)
		{
			arr.add(s.nextInt());
		}
		System.out.println("The Array: "+arr);
		reverse(arr);
	}
}
