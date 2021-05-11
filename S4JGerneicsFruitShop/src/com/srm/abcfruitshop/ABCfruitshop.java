package com.srm.abcfruitshop;

import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Logger;



public class ABCfruitshop extends BaseModel {
	static Logger log=Logger.getLogger( ABCfruitshop.class.getName());

	public static void main(String[] args) throws ParseException {
		var sc=new Scanner(System.in);
		log.info("ABC FRUIT SHOP");
		log.info("---------------------------------------------------------------------");
		log.info("""
				Enter the type of Item: , 
				* Fruits,
				* Grocery
				""");
		String s=sc.nextLine();
		switch(s)
		{
		case "Fruits":
			log.info("ITEM-->FRUITS");
			var fs=new FruitShop();
			fs.getDetails();
			break;
			
		case "Grocery":
			log.info("ITEM-->FRUITS");
			var gs=new GroceryShop();
			gs.getDetails();
			break;
			
		default:
			log.info("Invalid Option ...");
		}		
		sc.close();
	}
}
