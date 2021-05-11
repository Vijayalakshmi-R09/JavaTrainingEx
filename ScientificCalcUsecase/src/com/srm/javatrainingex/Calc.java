package com.srm.javatrainingex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calc {
	static Logger log=Logger.getLogger(Calc.class.getName());
	public static void main(String[] args) {
		double num1;
		double num2;
        var sc = new Scanner(System.in);
        log.info("Enter first number: ");
        num1 = sc.nextDouble();
        log.info("Enter second number: ");
        num2 = sc.nextDouble();

        log.info("Enter Operation: \n*Sum--> +\n*Divide--> /\n*Square-Root-->^\n*Cube-Root-->3\n*Tan-->t\n*Cos-->c ");
        var op = sc.next().charAt(0);

        double result;

        switch(op)
        {
            case '+':
            	result = num1 + num2;
            	log.info("Sum of "+num1+"and "+num2+" = "+result);
                break;

            case '^':
            	result = Math.sqrt(num1);
            	log.info("SquareRoot of "+num1+" = "+result);
                break;

            case '3':
            	result = Math.cbrt(num2) ;
            	log.info("CubeRoot of "+num2+" = "+result);
                break;

            case '/':
            	result = num1 / num2;
            	log.info("Division "+num1+"and "+num2+" = "+result);
                break;
            case 'c':
            	result = Math.cos(num1);
            	log.info("Cos Value of "+num1+" = "+result);
                break;
            case 't':
            	result = Math.tan(num2);
            	log.info("Tan Value of "+num2+" = "+result);
                break;
            default:
            	log.info("Invaild Operation");
                return;
        }
    }
}

