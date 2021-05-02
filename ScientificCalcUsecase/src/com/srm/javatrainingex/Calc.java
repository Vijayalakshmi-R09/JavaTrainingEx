package com.srm.javatrainingex;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter Operation: \n*Sum--> +\n*Divide--> /\n*Square-Root-->^\n*Cube-Root-->3\n*Tan-->t\n*Cos-->c ");
        char op = sc.next().charAt(0);

        double Result;

        switch(op)
        {
            case '+':
            	Result = num1 + num2;
            	System.out.println("Sum of "+num1+"and "+num2+" = "+Result);
                break;

            case '^':
            	Result = Math.sqrt(num1);
            	System.out.println("SquareRoot of "+num1+" = "+Result);
                break;

            case '3':
            	Result = Math.cbrt(num2) ;
            	System.out.println("CubeRoot of "+num2+" = "+Result);
                break;

            case '/':
            	Result = num1 / num2;
            	System.out.println("Division "+num1+"and "+num2+" = "+Result);
                break;
            case 'c':
            	Result = Math.cos(num1);
            	System.out.println("Cos Value of "+num1+" = "+Result);
                break;
            case 't':
            	Result = Math.tan(num2);
            	System.out.println("Tan Value of "+num2+" = "+Result);
                break;
            default:
                System.out.printf("Invaild Operation");
                return;
        }
    }
}

