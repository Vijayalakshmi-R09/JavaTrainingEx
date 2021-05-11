package com.srm.salesreportgeneration;

import java.util.Scanner;
import java.util.logging.Logger;

public class Reportdesign 
{
	static Logger log=Logger.getLogger( Reportdesign.class.getName());
	public void generateReport()
	{
		var id=0;
		var category="";
		var description="";	
		int quantity;
		float costPerItem;
		var cost=0;
		double totalCost=0;
		double grandTotal=0;
		double cGST;
		double sGST;
		var sc =new Scanner(System.in);
		log.info("Enter the no of items : ");
     	var n=sc.nextInt();
		var d=new Details[n];		
		for(var i=0;i<n;i++)
		{
			log.info("Enter the ID: ");
			id=sc.nextInt();
			log.info("Enter the Category : ");
			category=sc.next();
			log.info("Enter the Description : ");
			description=sc.next();
			log.info("Enter the Quantity :  ");
			quantity=sc.nextInt();
			log.info("Enter the Cost Per Item :  ");
			costPerItem=sc.nextFloat();
			d[i]=new Details(id,category,description,quantity,costPerItem);
			cost=(int) d[i].costCalc();
			totalCost+=cost;
		}	
		cGST=totalCost*0.06f;//map gve value for gst for speci category)
		sGST=totalCost*0.06f;
		grandTotal=totalCost+cGST+sGST;
		var sd=new Details();
		var dash="===========================================================================================";
		log.info(dash);
		System.out.printf("%50s",sd.shopName);
		log.info("");
		System.out.printf("%60s",sd.address);
		log.info("");
		log.info(dash);
		System.out.printf("%5s","Customer ID :");
		System.out.printf("%5s",sd.customerID);
		log.info("");
		System.out.printf("%5s","Date :");
		System.out.printf("%5s",sd.date);
		log.info("");
		log.info(dash);
		var format = "|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
	    System.out.format(format, "ID","CATEGORY","DESCRIPTION","QUANTITY","COST");
	    log.info(dash);
		for(var i=0;i<n;i++)
		{
			var fmat ="|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
		    System.out.format(fmat,d[i].id,d[i].category, d[i].description,d[i].quantity, d[i].cost);
		}
		log.info(dash);
		var sformat = "|%1$60s|%2$5s\n";
		System.out.format(sformat,"TOTAL",String.format("%.2f",totalCost));
	
		System.out.format(sformat,"C GST(6%)",String.format("%.2f",cGST));
		
		System.out.format(sformat,"S GST(6%)",String.format("%.2f",sGST));
		log.info(dash);
		
		System.out.format(sformat,"GRAND TOTAL",String.format("%.2f",grandTotal));
		log.info(dash);

}
}
