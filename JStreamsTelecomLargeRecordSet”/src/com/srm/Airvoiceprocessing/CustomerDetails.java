package com.srm.Airvoiceprocessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CustomerDetails 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<CustData> d=new ArrayList<CustData>();
		d.add(new CustData("1","Vijay","Tanzania","4578236914","PostPaid","Yes"));
		d.add(new CustData("2","Ajay","Rwanda","1542368791","PrePaid","Yes"));
		d.add(new CustData("3","Jay","Uganda","6178458765","PostPaid","Yes"));
		d.add(new CustData("4","Rea","Nigeria","5642368745","PostPaid","Yes"));
		d.add(new CustData("5","San","Tanzania","9854763214","PostPaid","No"));
		d.add(new CustData("6","Bane","Rwanda","4785125478","PostPaid","Yes"));
		d.add(new CustData("7","Lash","SouthAfrica","8745124578","PrePaid","No"));
		d.add(new CustData("8","Posh","Nigeria","5675289631","PostPaid","Yes"));
		d.add(new CustData("9","Dave","Uganda","6141289630","PostPaid","Yes"));
		d.add(new CustData("10","Rin","Tanzania","3571598246","PrePaid","No"));
		d.add(new CustData("11","Mike","Nigeria","5616549870","PostPaid","Yes"));
		d.add(new CustData("12","Zoe","Uganda","6116549877","PostPaid","Yes"));
		d.add(new CustData("13","Xander","Tanzania","7894561230","PrePaid","Yes"));
		d.add(new CustData("14","Yash","SouthAfrica","7894561231","PrePaid","Yes"));
		d.add(new CustData("15","Dave","Uganda","6112634870","PostPaid","Yes"));
	
		CustomerDetails f=new CustomerDetails();
		System.out.println("1. Fetch first 10 records");
		List<CustData> cd = d.stream() .limit(10).collect(Collectors.toList());
	    cd.forEach(cus -> System.out.println("CustomerID: "+ cus.CustomerId + 
	    			" CustomerName: "+ cus.CustomerName + " Country : " + cus.Country + 
	    			" PhoneNumber : "+ cus.PhoneNumber + " PhoneType : " + cus.phoneType + " Vas (IsActive): " + cus.vas));
	    System.out.println("\n-------------------------------------------------------------------------------------------------------------\n");
	    System.out.println("2.Query and Fetch 15 Phone Records , and iterate & display the results in the console");
	    List<CustData> cd1 = d.stream() .limit(15).collect(Collectors.toList());
	    cd1.forEach(cus -> System.out.println("CustomerID:"+ cus.CustomerId + 
    			"CustomerName: "+ cus.CustomerName + " Country : " + cus.Country + 
    			" PhoneNumber : "+ cus.PhoneNumber + " PhoneType : " + cus.phoneType + " Vas (IsActive): " + cus.vas));
	    System.out.println("\n-------------------------------------------------------------------------------------------------------------\n");
		System.out.println("3. Find all the records where the Customer is from “Tanzania” and has Postpaid connection with\r\n"
				+ "no VAS enabled");
		f.FilterByCountry((ArrayList<CustData>)d);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------\n");
		System.out.println("4.Find all the records where the Customer is from “South Africa” & “Rwanda” and has Prepaid\r\n"
				+ "connection with atleast one VAS enabled");
		f.FilterByCountryPhType((ArrayList<CustData>)d);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------\n");
		System.out.println("5.Perform Sorting Operations as follows\r\n"
				+ "1. Find all phones that starts with “61*”\r\n"
				+ "2. And Customer’s base country should be “Uganda”\r\n"
				+ "3. And vas Activated");
		ArrayList<CustData> a1=f.SortByPhoneNumber((ArrayList<CustData>)d);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		System.out.println("6.Sort the #5, based on customer name & Phone Number");
		f.SortByCustNamePhoneNumber((ArrayList<CustData>)a1);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		System.out.println("7.Query and return a matching customer based on Customer ID\n8.Return a Null Object if the above operation #7 return no matching records.");
		System.out.println("Enter the CutomerID: ");
		String m=sc.nextLine();
		f.FindMatchByCustID((ArrayList<CustData>)d,m);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		System.out.println("9.Print the content of the collection details in one single line ");
		System.out.println(d);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		System.out.println("10.Sort the Collections based on Customer case cntry, and add salutations to the customer name\r\n"
				+ "if not found, and remove first 2 elements in the collection and prefix +789 to all phone\r\n"
				+ "numbers\r\n"
				+ "and after doing all the operations, iterate & print the details in the console.");
		f.SortByCountryAddSalut((ArrayList<CustData>)d);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");
		System.out.println("11.Perform Sorting Operations as follows\r\n"
				+ "4. Find all phones that starts with “56*”\r\n"
				+ "5. And Customer’s base country should be “Nigeria”\r\n"
				+ "6. And convert all Customer's name to uppercase");
		f.SortByPhNoUpCase((ArrayList<CustData>)d);
	}
	private void SortByCountryAddSalut(ArrayList<CustData> d) {
		List<CustData> cus=d.stream().sorted((c1,c2)->c1.Country.compareTo(c2.Country)).
				filter(c -> !c.CustomerName.startsWith("Ms")).map((CustData c)->{
					c.CustomerName="Ms "+c.CustomerName;
							return c;})
						.collect(Collectors.toList());
				Iterator iter=cus.iterator();
				while(iter.hasNext())
				{
					
					System.out.println(iter.next());
				}
				
				}
		
	private void SortByPhNoUpCase(ArrayList<CustData> d) {
	d.stream().filter(d1->d1.PhoneNumber.startsWith("56")&&d1.Country.equals("Nigeria")).map((CustData cust)->
	{
	 cust.CustomerName=cust.CustomerName.toUpperCase();
	 return cust;
	}).forEach(System.out::println);
			
		
	}
	private void FindMatchByCustID(ArrayList<CustData> cdata,String m) {
		List<CustData> c1=cdata.stream().filter(cd->cd.CustomerId.equals(m)).map(cd->cd).collect(Collectors.toList());
		if(c1.isEmpty())
	{
			System.out.println("no record found");
		    System.out.println(c1);
	}
		else {
			System.out.println("Match found...");
			c1.forEach(System.out::println);
		}
	}
	private void SortByCustNamePhoneNumber(ArrayList<CustData> a1) {
		Collections.sort(a1,new SortByNameAndPhone());
		a1.forEach(System.out::println);
		
	}
	public  void FilterByCountry(ArrayList<CustData> cdata)
	{
			List <CustData> cus=cdata.stream().filter(fil-> fil.Country.equals("Tanzania") && 
				fil.phoneType.equals("PostPaid") && fil.vas.equals("No"))
		.collect(Collectors.toList());
		cus.forEach(System.out::println);
//		
	}  
	public void FilterByCountryPhType(ArrayList<CustData> cdata)
	{
		List<CustData> cus=cdata.stream().filter(fl-> fl.Country.equals("South Africa") ||
				fl.Country.equals("Rwanda") &&
				fl.phoneType.equals("PrePaid") && fl.vas.equals("Yes"))
		.map(fl->fl).collect(Collectors.toList());
		cus.forEach(System.out::println);
		
	}
	
	public  ArrayList<CustData> SortByPhoneNumber(ArrayList<CustData> cdata)
	{
		List<CustData> cus=cdata.stream().filter(fl-> fl.PhoneNumber.startsWith("61") && 
				fl.Country.equals("Uganda") && 
				fl.vas.equals("Yes"))
				.map(fl->fl).collect(Collectors.toList());
		cus.forEach(System.out::println);
		return (ArrayList<CustData>) cus;

	}

}
