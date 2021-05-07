package com.srm.Airvoiceprocessing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustData {
	
	String CustomerId;
	String CustomerName;
	String Country;
	String PhoneNumber;
	String phoneType;
	String vas;
	public CustData(String customerId, String customerName, String country, String phoneNumber, String phoneType,
			String vas) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		Country = country;
		PhoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.vas = vas;
	}
	@Override
	public String toString() {
		return "CustData [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", Country=" + Country
				+ ", PhoneNumber=" + PhoneNumber + ", phoneType=" + phoneType + ", vas=" + vas + "]";
	}

}
