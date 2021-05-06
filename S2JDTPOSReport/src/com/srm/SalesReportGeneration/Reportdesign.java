package com.srm.SalesReportGeneration;

import java.util.Scanner;

public class Reportdesign 
{
	public void generateReport()
	{
		int id=0;
		String category="";
		String description="";	
		int custId;
		int quantity;
		float costPerItem;
		double Cost;
		double totalCost=0;
		double grandTotal=0;
		double CGST;
		double SGST;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of items : ");
     	int n=sc.nextInt();
		Details[] d=new Details[n];		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the ID: ");
			id=sc.nextInt();
			System.out.println("Enter the Category : ");
			category=sc.next();
			System.out.println("Enter the Description : ");
			description=sc.next();
			System.out.println("Enter the Quantity :  ");
			quantity=sc.nextInt();
			System.out.println("Enter the Cost Per Item :  ");
			costPerItem=sc.nextFloat();
			d[i]=new Details(id,category,description,quantity,costPerItem);
			Cost=d[i].costCalc();
			totalCost+=Cost;
		}	
		CGST=totalCost*0.06f;
		SGST=totalCost*0.06f;
		grandTotal=totalCost+CGST+SGST;
		Details sd=new Details();
		System.out.println("===========================================================================================");
		System.out.printf("%50s",sd.shopName);
		System.out.println();
		System.out.printf("%60s",sd.address);
		System.out.println();
		System.out.println("===========================================================================================");
		System.out.printf("%5s","Customer ID :");
		System.out.printf("%5s",sd.customerID);
		System.out.println();
		System.out.printf("%5s","Date :");
		System.out.printf("%5s",sd.date);
		System.out.println();
		System.out.println("===========================================================================================");
		String format = "|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
	    System.out.format(format, "ID","CATEGORY","DESCRIPTION","QUANTITY","COST");
	    System.out.println("===========================================================================================");
		for(int i=0;i<n;i++)
		{
			String fmat ="|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
		    System.out.format(fmat,d[i].id,d[i].category, d[i].description,d[i].quantity,d[i].Cost);
		}
		System.out.println("===========================================================================================");
		String sformat = "|%1$60s|%2$5s\n";
		System.out.format(sformat,"TOTAL",String.format("%.2f",totalCost));
		String sformat1 = "|%1$60s|%2$5s\n";
		System.out.format(sformat1,"C GST(6%)",String.format("%.2f",CGST));
		String sformat2 = "|%1$60s|%2$5s\n";
		System.out.format(sformat2,"S GST(6%)",String.format("%.2f",SGST));
		System.out.println("===========================================================================================");
		String sformat3 = "|%1$60s|%2$5s\n";
		System.out.format(sformat3,"GRAND TOTAL",String.format("%.2f",grandTotal));
		System.out.println("===========================================================================================");

}
}
