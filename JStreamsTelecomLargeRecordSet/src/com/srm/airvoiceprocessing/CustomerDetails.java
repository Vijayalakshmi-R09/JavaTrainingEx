package com.srm.airvoiceprocessing;

import java.util.ArrayList;
import java.util.Collections;


import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Collectors;




public class CustomerDetails extends BaseModel 
{
	static Logger log=Logger.getLogger(CustomerDetails.class.getName());
	public static void main(String[] args)
	{
		var ni="Nigeria";
		var pp="PostPaid";
		var prp="PrePaid";
		var rw="Rwanda";
		var ta="Tanzania";
		var ug="Uganda";
		var sc=new Scanner(System.in);
		ArrayList<CustData> d=new ArrayList<>();
		d.add(new CustData("1","Vijay",ta,"4578236914",pp,"Yes"));
		d.add(new CustData("2","Ajay",rw,"1542368791",prp,"Yes"));
		d.add(new CustData("3","Jay",ug,"6178458765",pp,"Yes"));
		d.add(new CustData("4","Rea",ni,"5642368745",pp,"Yes"));
		d.add(new CustData("5","San",ta,"9854763214",pp,"No"));
		d.add(new CustData("6","Bane",rw,"4785125478",pp,"Yes"));
		d.add(new CustData("7","Lash","SouthAfrica","8745124578",prp,"No"));
		d.add(new CustData("8","Posh",ni,"5675289631",pp,"Yes"));
		d.add(new CustData("9","Dave",ug,"6141289630",pp,"Yes"));
		d.add(new CustData("10","Rin",ta,"3571598246",prp,"No"));
		d.add(new CustData("11","Mike",ni,"5616549870",pp,"Yes"));
		d.add(new CustData("12","Zoe",ug,"6116549877",pp,"Yes"));
		d.add(new CustData("13","Xander",ta,"7894561230",prp,"Yes"));
		d.add(new CustData("14","Yash","SouthAfrica","7894561231",prp,"Yes"));
		d.add(new CustData("15","Dave",ug,"6112634870",pp,"Yes"));
	
		var f=new CustomerDetails();
		log.info("1. Fetch first 10 records");
		List<CustData> cd = d.stream() .limit(10).collect(Collectors.toList());
	    cd.forEach(cus -> log.info("CustomerID: "+ cus.customerId + 
	    			" CustomerName: "+ cus.customerName + " Country : " + cus.country + 
	    			" PhoneNumber : "+ cus.phoneNumber + " PhoneType : " + cus.phoneType + " Vas (IsActive): " + cus.vas));
	    var dash="\n-------------------------------------------------------------------------------------------------------------\n";
	    log.info(dash);
	    log.info("2.Query and Fetch 15 Phone Records , and iterate & display the results in the console");
	    List<CustData> cd1 = d.stream() .limit(15).collect(Collectors.toList());
	    cd1.forEach(cus -> log.info("CustomerID:"+ cus.customerId + 
    			"CustomerName: "+ cus.customerName + " Country : " + cus.country + 
    			" PhoneNumber : "+ cus.phoneNumber + " PhoneType : " + cus.phoneType + " Vas (IsActive): " + cus.vas));
	    log.info(dash);
		log.info("3. Find all the records where the Customer is from “Tanzania” and has Postpaid connection with\r\n"
				+ "no VAS enabled");
		f.filterByCountry(d);
		log.info(dash);
		log.info("4.Find all the records where the Customer is from “South Africa” & “Rwanda” and has Prepaid\r\n"
				+ "connection with atleast one VAS enabled");
		f.filterByCountryPhType(d);
		log.info(dash);
		log.info("""
				5.Perform Sorting Operations as follows,
				1. Find all phones that starts with “61*”,
				2. And Customer’s base country should be “Uganda”,
				3. And vas Activated
				""");
		List<CustData> a1=f.sortByPhoneNumber(d);
		log.info(dash);
		log.info("6.Sort the #5, based on customer name & Phone Number");
		f.sortByCustNamePhoneNumber(a1);
		log.info(dash);
		log.info("7.Query and return a matching customer based on Customer ID\n8.Return a Null Object if the above operation #7 return no matching records.");
		log.info("Enter the CutomerID: ");
		String m=sc.nextLine();
		f.findMatchByCustID(d,m);
		log.info(dash);
		log.info("9.Print the content of the collection details in one single line ");
		log.info(d+"");
		log.info(dash);
		log.info("""
				10.Sort the Collections based on Customer case entry, and add salutations to the customer name,
				if not found, and remove first 2 elements in the collection and prefix ,789 to all phonenumbers,
				and after doing all the operations, iterate & print the details in the console.
				""");
		f.sortByCountryAddSalut(d);
		log.info(dash);
		log.info("""
				11.Perform Sorting Operations as follows,
				4. Find all phones that starts with “56*”,
				5. And Customer’s base country should be “Nigeria”,
				6. And convert all Customer's name to uppercase
				""");
		f.sortByPhNoUpCase(d);
		sc.close();
	}
	private void sortByCountryAddSalut(List<CustData> d) {//try comparing
		List<CustData> cus=d.stream().sorted((c1,c2)->c1.country.compareTo(c2.country)).
				filter(c -> !c.customerName.startsWith("Ms")).map((CustData c)->{
					c.customerName="Ms "+c.customerName;
							return c;})
						.collect(Collectors.toList());
				var iter=cus.iterator();
				while(iter.hasNext())
				{
					
					log.info((Supplier<String>) iter.next());
				}
			
				}
		
	private void sortByPhNoUpCase(List<CustData> d) {
	List<CustData> cus=d.stream().filter(d1->d1.phoneNumber.startsWith("56")&&d1.country.equals("Nigeria")).map((CustData cust)->
	{
	 cust.customerName=cust.customerName.toUpperCase();
	 return cust;
	}).collect(Collectors.toList());
	for(var i=0;i<cus.size();i++) {
		log.info(cus.get(i)+"");
	}
			
		
	}
	private void findMatchByCustID(List<CustData> cdata,String m) {
		List<CustData> c1=cdata.stream().filter(cd->cd.customerId.equals(m)).map(cd->cd).collect(Collectors.toList());
		if(c1.isEmpty())
	{
			log.info("no record found");
		    log.info(c1+"");
	}
		else {
			log.info("Match found...");
			for(var i=0;i<c1.size();i++) {
				log.info(c1.get(i)+"");
			}
		}
	}
	private void sortByCustNamePhoneNumber(List<CustData> a1) {
		Collections.sort(a1,new SortByNameAndPhone());
		for(var i=0;i<a1.size();i++) {
			log.info(a1.get(i)+"");
		}
		
	}
	public  void filterByCountry(List<CustData> cdata)
	{
			List <CustData> cus=cdata.stream().filter(fil-> fil.country.equals("Tanzania") && 
				fil.phoneType.equals("PostPaid") && fil.vas.equals("No"))
		.collect(Collectors.toList());
			for(var i=0;i<cus.size();i++) {
				log.info(cus.get(i)+"");
			}
		
	}  
	public void filterByCountryPhType(List<CustData> cdata)
	{
		List<CustData> cus=cdata.stream().filter(fl-> fl.country.equals("South Africa") ||
				fl.country.equals("Rwanda") &&
				fl.phoneType.equals("PrePaid") && fl.vas.equals("Yes"))
		.map(fl->fl).collect(Collectors.toList());
		for(var i=0;i<cus.size();i++) {
			log.info(cus.get(i)+"");
		}
		
	}
	
	public  List<CustData> sortByPhoneNumber(List<CustData> cdata)
	{
		List<CustData> cus=cdata.stream().filter(fl-> fl.phoneNumber.startsWith("61") && 
				fl.country.equals("Uganda") && 
				fl.vas.equals("Yes"))
				.map(fl->fl).collect(Collectors.toList());
		for(var i=0;i<cus.size();i++) {
			log.info(cus.get(i)+"");
		}
		return  cus;

	}

}
