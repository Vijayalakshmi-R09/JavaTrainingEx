package com.srm.Airvoiceprocessing;

import java.util.Comparator;

public class SortByNameAndPhone implements Comparator<CustData> {

	@Override
	public int compare(CustData o1, CustData o2) {
		int val=o1.CustomerName.compareTo(o2.CustomerName);
		if(o1.CustomerName.equals(o2.CustomerName))
		{
			return o1.PhoneNumber.compareTo(o2.PhoneNumber);
		}
		else
		{
			return val;
		}
	}

}
