package com.srm.javatrainingex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortarrListDes {

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
		System.out.println("The ArrayList: ");
		for(String k: arr)
		{
			System.out.print(k+" ");
		}
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println("\nArrayList in descending order:");
		for(String k: arr)
		{
			System.out.print(k+" ");
		}

	}

}
