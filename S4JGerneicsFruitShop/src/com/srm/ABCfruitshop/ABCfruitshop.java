package com.srm.ABCfruitshop;

import java.text.ParseException;
import java.util.Scanner;



public class ABCfruitshop {
	public static String centerString (int width, String s) {
	    return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
	}

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println(centerString(100, "ABC FRUIT SHOP"));
		System.out.println(centerString(100,"---------------------------------------------------------------------"));
		System.out.println("Enter the type of Item: \n"+" * Fruits\n"+" * Grocery\n");
		String s=sc.nextLine();
		switch(s)
		{
		case "Fruits":
			System.out.println("ITEM-->FRUITS");
			FruitShop fs=new FruitShop();
			fs.getDetails();
			break;
			
		case "Grocery":
			System.out.println("ITEM-->FRUITS");
			GroceryShop gs=new GroceryShop();
			gs.getDetails();
			break;
			
		default:
			System.out.println("Invalid Option ...");
		}		
		
	}
}
