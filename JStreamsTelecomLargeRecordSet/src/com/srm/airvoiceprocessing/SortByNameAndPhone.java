package com.srm.airvoiceprocessing;

import java.util.Comparator;

public class SortByNameAndPhone implements Comparator<CustData> {

	@Override
	public int compare(CustData o1, CustData o2) {
		int val=o1.customerName.compareTo(o2.customerName);
		if(o1.customerName.equals(o2.customerName))
		{
			return o1.phoneNumber.compareTo(o2.phoneNumber);
		}
		else
		{
			return val;
		}
	}

}
