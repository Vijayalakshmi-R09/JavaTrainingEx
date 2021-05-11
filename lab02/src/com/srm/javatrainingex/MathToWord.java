package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class MathToWord {
	static Logger log=Logger.getLogger(MathToWord.class.getName());
	static void toWord(char[] n)
	{
		int l = n.length; 
		if (l == 0)   
		{     
		log.info("The string is empty.");  
		return;  
		}  
		if (l > 4)   
		{    
			log.info("\n The given number has more than 4 digits.");  
		return;  
		}  
		String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
		String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
		String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
		String[] poweroftens = new String[] {"Hundred", "Thousand"};  
		log.info(String.valueOf(n) + ": ");  
		if (l == 1)   
		{  
			log.info(onedigit[n[0]-'0']);  
		return;  
		}  
		var x = 0;  
		while (x < n.length)   
		{  
		if (l >= 3)   
		{  
		if (n[x] - '0' != 0)   
		{  
			log.info(onedigit[n[x] - '0'] + " ");  
			log.info(poweroftens[l - 3]+ " ");  
		}  
		--l;  
		}  
		else   
		{  
		if (n[x] - '0' == 1)   
		{  
		int sum = n[x] - '0' + n[x + 1] - '0';  
		log.info(twodigits[sum]);  
		return;  
		}  
		else if (n[x] - '0' == 2 && n[x + 1] - '0' == 0)   
		{  
			log.info("Twenty");  
		return;  
		}  
		else   
		{  
		int i = (n[x] - '0');  
		if (i > 0)  
			log.info(multipleoftens[i]+ " ");  
		else  
			log.info("");  
		++x;  
		if (n[x] - '0' != 0)  
			log.info(onedigit[n[x] - '0']);  
		} 
		}  
		++x;  
		}  
		}  
		
	public static void main(String[] args) {
		var s = new Scanner(System.in);
		log.info("Enter the Value ");
		String str=s.next();
		toWord(str.toCharArray());
	}
}
