package com.srm.abcfruitshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class GroceryShop {
	static Logger log=Logger.getLogger( GroceryShop.class.getName());
	public void getDetails() throws ParseException
	{
		List<GroceryDetails> gdetails=new ArrayList<>();
		var sc=new Scanner(System.in);
		log.info("Enter the no of Records: ");
		var n=sc.nextInt();
		var sdf=new SimpleDateFormat("dd/MM/yy");
		for(var i=0;i<n;i++)
		{
			log.info("Enter the Grocery Name: ");
			String gname=sc.next();
			log.info("Enter the Grocery Type: ");
			String gtype=sc.next();
			log.info("Enter the WholeSeller Name: ");
			String wname=sc.next();
			log.info("Enter the Grocery Weight: ");
			var gweight=sc.nextDouble();
			log.info("Enter the Grocery Category: ");
			String gcategory=sc.next();
			log.info("Enter the Grocery Expiry Date: ");
			String gexdate=sc.next();
			sdf.parse(gexdate);
			log.info("Enter the Cost per Packet: ");
			var gcostpack=sc.nextDouble();
			log.info("Enter the PacketSize: ");
			var psize=sc.nextInt();
			gdetails.add(new GroceryDetails(gname,gtype,wname,gweight,gcategory,gexdate,gcostpack,psize));
		}
		var gs=new GroceryShop();
		log.info("Search By....");
		log.info("Enter the Expiry date  : ");
		String str=sc.next();
		sdf.parse(str);
		gs.searchByExpiryDate(gdetails, str);
		log.info("Search by WholesellerName : ");
		String ds=sc.next();
		gs.searchByWName(gdetails, ds);
		log.info("Sort by GroceryName : ");
		gs.sortByGroceryName(gdetails);
		log.info("Sort by GroceryType : ");
		gs.sortByGroceryType(gdetails);
		log.info("Sort by ExpiryDate : ");
		gs.sortByExpiryDate(gdetails);
		log.info("Sort by WholeSellerName : ");
		gs.sortByWholesellerName(gdetails);
		sc.close();
	}
	public void sortByGroceryName(List<GroceryDetails> al)
	{
		List<GroceryDetails> l1=al.stream().map(gd->gd).sorted((c1,c2)->c1.groceryName.compareTo(c2.groceryName)).collect(Collectors.toList());
		for(var i=0;i<l1.size();i++)
		{
			log.info(l1.get(i)+"\n");
		}
	}
	public void sortByExpiryDate(List<GroceryDetails> al)
	{
		List<GroceryDetails> l2=al.stream().map(gd->gd).sorted((c1,c2)->c1.expiryDate.compareTo(c2.expiryDate)).collect(Collectors.toList());
		for(var i=0;i<l2.size();i++)
		{
			log.info(l2.get(i)+"\n");
		}
	}
	public void sortByWholesellerName(List<GroceryDetails> al)
	{
		List<GroceryDetails> l3=al.stream().map(gd->gd).sorted((c1,c2)->c1.wholesellerName.compareTo(c2.wholesellerName)).collect(Collectors.toList());
		for(var i=0;i<l3.size();i++)
		{
			log.info(l3.get(i)+"\n");
		}
	}
	
	public void sortByGroceryType(List<GroceryDetails> al)
	{
		List<GroceryDetails> l=al.stream().map(gd->gd).sorted((c1,c2)->c1.groceryType.compareTo(c2.groceryType)).collect(Collectors.toList());
		for(var i=0;i<l.size();i++)
		{
			log.info(l.get(i)+"\n");
		}
	}
	public void searchByWName(List<GroceryDetails> al,String wholeSellName)
	{
		for(GroceryDetails gd:al)
		{
			if(gd.wholesellerName.equals(wholeSellName))
			{
				log.info(" "+gd);
			}
		}
	}
	public void searchByExpiryDate(List<GroceryDetails> al,String d)
	{
		for(GroceryDetails ge:al)
		{
			if(ge.expiryDate.equals(d))
			{
				log.info(" "+ge);
			}
		}
	}
	public void searchByCategory(List<GroceryDetails> al,String cat)
	{
		for(GroceryDetails gc:al)
		{
			if(gc.groceryCategory.equals(cat))
			{
				log.info(" "+gc);
			}
		}
	}
}



