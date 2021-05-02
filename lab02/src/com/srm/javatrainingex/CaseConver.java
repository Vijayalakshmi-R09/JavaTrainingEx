package com.srm.javatrainingex;

import java.util.Scanner;

public class CaseConver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("\nGiven String: \n"+str);
        System.out.println("Lower case string is : " + str);
        char strArr[] = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32);
            }
        }
        System.out.print("Upper case string is : ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
	}
}
