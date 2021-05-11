package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Swapex10 {
	static Logger log=Logger.getLogger(Swapex10.class.getName());

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Enter the values: \nNum1:");
		var num1=sc.nextInt();
		log.info("Num2:");
		var num2=sc.nextInt();
		log.info("Values before SWAP Num1: "+num1+" Num2: "+num2);
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		log.info("Values After SWAP Num1: "+num1+" Num2: "+num2);
	}
}
