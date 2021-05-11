package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class SignedintTostr {
	static Logger log=Logger.getLogger(SignedintTostr.class.getName());
	public static void main(String[] args) {
		var s = new Scanner(System.in);
		log.info("Enter the Value ");
		var n=s.nextInt();
		var str = String.valueOf(n);
		log.info("String str = " + str);
	}
}
