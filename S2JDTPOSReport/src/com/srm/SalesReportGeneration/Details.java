package com.srm.SalesReportGeneration;

import java.util.Calendar;

public class Details extends BaseModel {
		
		int id;
		int customerID=(int)(Math.random()*(1000-500+1)+500);  
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
		double Cost;
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
			Cost=costPerItem*quantity;
			return Cost;
		}
		
		public static void main(String[] args)
		{
			Reportdesign rd=new Reportdesign();
			rd.generateReport();
		}
		
}
