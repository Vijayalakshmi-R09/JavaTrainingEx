package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class CaseConver {
	static Logger log=Logger.getLogger(CaseConver.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        log.info("Enter the string: ");
        String str=sc.nextLine();
        log.info("\nGiven String: \n"+str);
        log.info("Lower case string is : " + str);
        char[]  strArr= str.toCharArray();
        for (var i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32);
            }
        }
        log.info("Upper case string is : ");
        for (var i = 0; i < strArr.length; i++) {
        	log.fine(strArr[i]+"");
        }
	}
}
