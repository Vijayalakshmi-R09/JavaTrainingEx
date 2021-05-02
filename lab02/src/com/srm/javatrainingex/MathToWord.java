package com.srm.javatrainingex;

import java.util.Scanner;

public class MathToWord {
	static void toWord(char n[])
	{
		int l = n.length; 
		if (l == 0)   
		{     
		System.out.println("The string is empty.");  
		return;  
		}  
		if (l > 4)   
		{    
		System.out.println("\n The given number has more than 4 digits.");  
		return;  
		}  
		String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
		String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
		String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
		String[] poweroftens = new String[] {"Hundred", "Thousand"};  
		System.out.print(String.valueOf(n) + ": ");  
		if (l == 1)   
		{  
		System.out.println(onedigit[n[0]-'0']);  
		return;  
		}  
		int x = 0;  
		while (x < n.length)   
		{  
		if (l >= 3)   
		{  
		if (n[x] - '0' != 0)   
		{  
		System.out.print(onedigit[n[x] - '0'] + " ");  
		System.out.print(poweroftens[l - 3]+ " ");  
		}  
		--l;  
		}  
		else   
		{  
		if (n[x] - '0' == 1)   
		{  
		int sum = n[x] - '0' + n[x + 1] - '0';  
		System.out.println(twodigits[sum]);  
		return;  
		}  
		else if (n[x] - '0' == 2 && n[x + 1] - '0' == 0)   
		{  
		System.out.println("Twenty");  
		return;  
		}  
		else   
		{  
		int i = (n[x] - '0');  
		if (i > 0)  
		System.out.print(multipleoftens[i]+ " ");  
		else  
		System.out.print("");  
		++x;  
		if (n[x] - '0' != 0)  
		System.out.println(onedigit[n[x] - '0']);  
		} 
		}  
		++x;  
		}  
		}  
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value ");
		String str=s.next();
		toWord(str.toCharArray());
	}
}
