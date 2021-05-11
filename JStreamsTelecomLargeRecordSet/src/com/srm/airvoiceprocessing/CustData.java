package com.srm.airvoiceprocessing;





public class CustData {
	
	String customerId;
	String customerName;
	String country;
	String phoneNumber;
	String phoneType;
	String vas;
	public CustData(String customerId, String customerName, String country, String phoneNumber, String phoneType,
			String vas) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.vas = vas;
	}
	@Override
	public String toString() {
		return "CustData [CustomerId=" + customerId + ", CustomerName=" + customerName + ", Country=" + country
				+ ", PhoneNumber=" + phoneNumber + ", phoneType=" + phoneType + ", vas=" + vas + "]";
	}

}
