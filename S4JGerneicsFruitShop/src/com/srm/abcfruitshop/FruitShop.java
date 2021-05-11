package com.srm.abcfruitshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;


import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FruitShop {
	static Logger log=Logger.getLogger( FruitShop.class.getName());
	public void getDetails() throws ParseException
	{
		
		List<Fruitdetails> fdetails=new ArrayList<>();
		var sc=new Scanner(System.in);
		log.info("Enter the no of Records: ");
		var n=sc.nextInt();
		var sdf=new SimpleDateFormat("dd/MM/yy");
		for(var i=0;i<n;i++)
		{
			log.info("Enter the Fruit Name: ");
			String fname=sc.next();
			log.info("Enter the Fruit Type: ");
			String ftype=sc.next();
			log.info("Enter the Distributor Name: ");
			String dname=sc.next();
			log.info("Enter the Fruit Weight: ");
			var fweight=sc.nextDouble();
			log.info("Enter the Fruit Category: ");
			String fcategory=sc.next();
			log.info("Enter the Quantity: ");
			var quantity=sc.nextInt();
			log.info("Enter the Location of the Farm: ");
			String loc=sc.next();
			log.info("Enter the Fruit Expiry Date: ");
			String fexdate=sc.next();
			sdf.parse(fexdate);
			log.info("Enter the Cost per Kg: ");
			var costkg=sc.nextDouble();
			fdetails.add(new Fruitdetails(fname,ftype,dname,fweight,fcategory,quantity,loc,fexdate,costkg));
		}
		var fs=new FruitShop();
		log.info("Search By....");
		log.info("Enter the Expiry date  : ");
		String str=sc.next();
		sdf.parse(str);
		fs.searchByExpiryDate(fdetails, str);
		log.info("Search by Distributor : ");
		fs.searchByDistName(fdetails,"Vj");
		log.info("Sort by FruitName : ");
		fs.sortByFruitName(fdetails);
		log.info("Sort by FruitType : ");
		fs.sortByFruitType(fdetails);
		log.info("Sort by ExpiryDate : ");
		fs.sortByExpiryDate(fdetails);
		log.info("Sort by DistributorName : ");
		fs.sortByDistributorName(fdetails);
	sc.close();
	}
	public void sortByFruitName(List<Fruitdetails> al)
	{
		List<Fruitdetails> l=al.stream().map(fd->fd).sorted((c1,c2)->c1.fruitName.compareTo(c2.fruitName)).collect(Collectors.toList());
		for(var i=0;i<al.size();i++)
		{
			log.info(l.get(i)+"\n");
		}
	}
	public void sortByExpiryDate(List<Fruitdetails> al)
	{
		List<Fruitdetails> l=al.stream().map(fd->fd).sorted((c1,c2)->c1.expiryDate.compareTo(c2.expiryDate)).collect(Collectors.toList());
		for(var i=0;i<l.size();i++)
		{
			log.info(l.get(i)+"\n");
		}
	}
	public void sortByDistributorName(List<Fruitdetails> al)
	{
		List<Fruitdetails> l=al.stream().map(fd->fd).sorted((c1,c2)->c1.distributorName.compareTo(c2.distributorName)).collect(Collectors.toList());
		for(var i=0;i<l.size();i++)
		{
			log.info(l.get(i)+"\n");
		}
	}
	
	public void sortByFruitType(List<Fruitdetails> al)
	{
		Collections.sort(al,new SortByFruitType());
		for(var i=0;i<al.size();i++)
		{
			log.info(al.get(i)+"\n");
		}
	}
	public void searchByDistName(List<Fruitdetails> al,String distName)
	{
		for(Fruitdetails fd:al)
		{
			if(fd.distributorName.equals(distName))
			{
				log.fine(" "+fd);
			}
		}
	}
	public void searchByExpiryDate(List<Fruitdetails> al,String d)//do with stream//another way do using map 
	{
		for(Fruitdetails fe:al)
		{
			if(fe.expiryDate.equals(d))
			{
				log.fine(" "+fe);
			}
		}
	}
	public void searchByLocation(List<Fruitdetails> al,String loc)//stream concept
	{
		for(Fruitdetails fl:al)
		{
			if(fl.location.equals(loc))
			{
				log.fine(" "+fl);
			}
		}
	}
}
