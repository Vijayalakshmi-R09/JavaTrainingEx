package com.srm.salesreportgeneration;

import java.util.Calendar;
import java.util.Random;

public class Details implements BaseModel {
		Random r=new Random();
		int rand=r.nextInt(150);
		int id;
		int customerID=rand;
		String category;
		String description;
		String shopName="HAPPY E-MART";
		String address="No:547,FA Wellington";
		Calendar c=Calendar.getInstance();
		int day=c.get(Calendar.DATE);
		int mon=c.get(Calendar.MONTH)+1;
		int year=c.get(Calendar.YEAR);
		String date=day+"/"+mon+"/"+year;
		int quantity;
		float costPerItem;
		double cost;
		double totalCost;
		double grandTotal;
		
		public Details(int id, String category,String description, int quantity, float costPerItem) {
			super();
			this.id=id;
			this.category = category;
			this.description=description;
			this.quantity = quantity;
			this.costPerItem = costPerItem;
		}
		
		public Details() {
			
		}
		
		double costCalc(){
			cost=costPerItem*quantity;
			return cost;
		}
		
		public static void main(String[] args)
		{
			var rd=new Reportdesign();
			rd.generateReport();
		}
		
}
