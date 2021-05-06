package com.srm.ABCfruitshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FruitShop {
	
	public void getDetails() throws ParseException
	{
		List<Fruitdetails> fdetails=new ArrayList<Fruitdetails>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Records: ");
		int n=sc.nextInt();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Fruit Name: ");
			String fname=sc.next();
			System.out.println("Enter the Fruit Type: ");
			String ftype=sc.next();
			System.out.println("Enter the Distributor Name: ");
			String Dname=sc.next();
			System.out.println("Enter the Fruit Weight: ");
			double fweight=sc.nextDouble();
			System.out.println("Enter the Fruit Category: ");
			String fcategory=sc.next();
			System.out.println("Enter the Quantity: ");
			int quantity=sc.nextInt();
			System.out.println("Enter the Location of the Farm: ");
			String loc=sc.next();
			System.out.println("Enter the Fruit Expiry Date: ");
			String fexdate=sc.next();
			sdf.parse(fexdate);
			System.out.println("Enter the Cost per Kg: ");
			double costkg=sc.nextDouble();
			fdetails.add(new Fruitdetails(fname,ftype,Dname,fweight,fcategory,quantity,loc,fexdate,costkg));
		}
		FruitShop fs=new FruitShop();
		System.out.println("Search By....");
		System.out.println("Enter the Expiry date  : ");
		String str=sc.next();
		sdf.parse(str);
		fs.searchByExpiryDate((ArrayList<Fruitdetails>)fdetails, str);
		System.out.println("Search by Distributor : ");
		fs.searchByDistName((ArrayList<Fruitdetails>)fdetails,"Vj");
		System.out.println("Sort by FruitName : ");
		fs.sortByFruitName((ArrayList<Fruitdetails>)fdetails);
		System.out.println("Sort by FruitType : ");
		fs.sortByFruitType((ArrayList<Fruitdetails>)fdetails);
		System.out.println("Sort by ExpiryDate : ");
		fs.sortByExpiryDate((ArrayList<Fruitdetails>)fdetails);
		System.out.println("Sort by DistributorName : ");
		fs.sortByDistributorName((ArrayList<Fruitdetails>)fdetails);
	
	}
	public void sortByFruitName(ArrayList<Fruitdetails> al)
	{
		List<Fruitdetails> l=al.stream().map(fd->fd).sorted((c1,c2)->c1.FruitName.compareTo(c2.FruitName)).collect(Collectors.toList());
		l.forEach(System.out::println);
	}
	public void sortByExpiryDate(ArrayList<Fruitdetails> al)
	{
		List<Fruitdetails> l=al.stream().map(fd->fd).sorted((c1,c2)->c1.ExpiryDate.compareTo(c2.ExpiryDate)).collect(Collectors.toList());
		l.forEach(System.out::println);
	}
	public void sortByDistributorName(ArrayList<Fruitdetails> al)
	{
		List<Fruitdetails> l=al.stream().map(fd->fd).sorted((c1,c2)->c1.DistributorName.compareTo(c2.DistributorName)).collect(Collectors.toList());
		l.forEach(System.out::println);
	}
	
	public void sortByFruitType(ArrayList<Fruitdetails> al)
	{
		Collections.sort(al,new SortByFruitType());
		al.forEach(System.out::println);
	}
	public void searchByDistName(ArrayList<Fruitdetails> al,String DistName)
	{
		for(Fruitdetails fd:al)
		{
			if(fd.DistributorName.equals(DistName))
			{
				System.out.println(fd.toString());
			}
		}
	}
	public void searchByExpiryDate(ArrayList<Fruitdetails> al,String d)
	{
		for(Fruitdetails fe:al)
		{
			if(fe.ExpiryDate.equals(d))
			{
				System.out.println(fe.toString());
			}
		}
	}
	public void searchByLocation(ArrayList<Fruitdetails> al,String loc)
	{
		for(Fruitdetails fl:al)
		{
			if(fl.Location.equals(loc))
			{
				System.out.println(fl.toString());
			}
		}
	}
}
