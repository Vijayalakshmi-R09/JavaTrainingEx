package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListtoStrList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int n=s.nextInt();
		ArrayList<String> arr=new ArrayList<String>(n);
		System.out.println("Enter the Elements: ");
		for(int i=0;i<n;i++)
		{
			arr.add(s.next());
		}
		System.out.println("The ArrayList: "+arr);
		String array[] = new String[arr.size()];              
		for(int j =0;j<arr.size();j++)
		{
			  array[j] = arr.get(j);
		}
		System.out.println("String array: ");
		for(String k: array)
		{
			System.out.print(k+" ");
		}
	}

}
