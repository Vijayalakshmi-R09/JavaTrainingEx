package com.srm.ABCfruitshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroceryShop {
	
	public void getDetails() throws ParseException
	{
		List<GroceryDetails> gdetails=new ArrayList<GroceryDetails>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Records: ");
		int n=sc.nextInt();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Grocery Name: ");
			String gname=sc.next();
			System.out.println("Enter the Grocery Type: ");
			String gtype=sc.next();
			System.out.println("Enter the WholeSeller Name: ");
			String Wname=sc.next();
			System.out.println("Enter the Grocery Weight: ");
			double gweight=sc.nextDouble();
			System.out.println("Enter the Grocery Category: ");
			String gcategory=sc.next();
			System.out.println("Enter the Grocery Expiry Date: ");
			String gexdate=sc.next();
			sdf.parse(gexdate);
			System.out.println("Enter the Cost per Packet: ");
			double gcostpack=sc.nextDouble();
			System.out.println("Enter the PacketSize: ");
			int psize=sc.nextInt();
			gdetails.add(new GroceryDetails(gname,gtype,Wname,gweight,gcategory,gexdate,gcostpack,psize));
		}
		GroceryShop gs=new GroceryShop();
		System.out.println("Search By....");
		System.out.println("Enter the Expiry date  : ");
		String str=sc.next();
		sdf.parse(str);
		gs.searchByExpiryDate((ArrayList<GroceryDetails>)gdetails, str);
		System.out.println("Search by WholesellerName : ");
		String ds=sc.next();
		gs.searchByWName((ArrayList<GroceryDetails>)gdetails, ds);
		System.out.println("Sort by GroceryName : ");
		gs.sortByGroceryName((ArrayList<GroceryDetails>)gdetails);
		System.out.println("Sort by GroceryType : ");
		gs.sortByGroceryType((ArrayList<GroceryDetails>)gdetails);
		System.out.println("Sort by ExpiryDate : ");
		gs.sortByExpiryDate((ArrayList<GroceryDetails>)gdetails);
		System.out.println("Sort by WholeSellerName : ");
		gs.sortByWholesellerName((ArrayList<GroceryDetails>)gdetails);
	}
	public void sortByGroceryName(ArrayList<GroceryDetails> al)
	{
		List<GroceryDetails> l1=al.stream().map(gd->gd).sorted((c1,c2)->c1.GroceryName.compareTo(c2.GroceryName)).collect(Collectors.toList());
		l1.forEach(System.out::println);
	}
	public void sortByExpiryDate(ArrayList<GroceryDetails> al)
	{
		List<GroceryDetails> l2=al.stream().map(gd->gd).sorted((c1,c2)->c1.ExpiryDate.compareTo(c2.ExpiryDate)).collect(Collectors.toList());
		l2.forEach(System.out::println);
	}
	public void sortByWholesellerName(ArrayList<GroceryDetails> al)
	{
		List<GroceryDetails> l3=al.stream().map(gd->gd).sorted((c1,c2)->c1.WholesellerName.compareTo(c2.WholesellerName)).collect(Collectors.toList());
		l3.forEach(System.out::println);
	}
	
	public void sortByGroceryType(ArrayList<GroceryDetails> al)
	{
		List<GroceryDetails> l=al.stream().map(gd->gd).sorted((c1,c2)->c1.GroceryType.compareTo(c2.GroceryType)).collect(Collectors.toList());
		l.forEach(System.out::println);
	}
	public void searchByWName(ArrayList<GroceryDetails> al,String WholeSellName)
	{
		for(GroceryDetails gd:al)
		{
			if(gd.WholesellerName.equals(WholeSellName))
			{
				System.out.println(gd.toString());
			}
		}
	}
	public void searchByExpiryDate(ArrayList<GroceryDetails> al,String d)
	{
		for(GroceryDetails ge:al)
		{
			if(ge.ExpiryDate.equals(d))
			{
				System.out.println(ge.toString());
			}
		}
	}
	public void searchByCategory(ArrayList<GroceryDetails> al,String cat)
	{
		for(GroceryDetails gc:al)
		{
			if(gc.GroceryCategory.equals(cat))
			{
				System.out.println(gc.toString());
			}
		}
	}
}



