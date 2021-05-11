package com.srm.javatrainingex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class StrAnagram {
	static Logger log=Logger.getLogger( StrAnagram.class.getName());

	static void isAnagram(String string1, String string2) {  
        var str1 = string1.replaceAll("\\s", "");  
        var str2 = string2.replaceAll("\\s", "");  
        var val = true;  
        if (str1.length() != str2.length()) 
        {  
            val = false;  
        } 
        else 
        {  
            char[] arr1 = str1.toLowerCase().toCharArray();  
            char[] arr2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(arr1);  
            Arrays.sort(arr2);  
            val = Arrays.equals(arr1, arr2);  
        }  
        if (val) {  
            log.info(str1 + " and " + str2 + " are anagrams");  
        } else {  
        	log.info(str1 + " and " + str2 + " are not anagrams");  
        }  
    }  
   
  
	public static void main(String[] args) 
	{
         var sc=new Scanner(System.in);
         log.info("Enter string 1: ");
         String s1=sc.next();
         log.info("Enter string 2: ");
         String s2=sc.next();
		 isAnagram(s1,s2);  
	     isAnagram("I am alone", "I am fine");  
	}

}
