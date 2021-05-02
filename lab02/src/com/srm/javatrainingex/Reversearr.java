package com.srm.javatrainingex;

import java.util.Scanner;

public class Reversearr {
	static void reverseArr(int arr[])
	{
		int n1=arr.length;
		int i, k, t;
        for (i = 0; i < n1 / 2; i++) {
            t = arr[i];
            arr[i] = arr[n1 - i - 1];
            arr[n1 - i - 1] = t;
        }
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n1; k++) {
            System.out.println(arr[k]);
        }
		
	}

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
		reverseArr(arr);
	}

}
