package com.srm.ABCfruitshop;

import java.util.Date;

public class GroceryDetails {

	String GroceryName;
	String GroceryType;
	String WholesellerName;
	double GroceryWeight;
	String GroceryCategory;
	String ExpiryDate;
	double CostPerPacket;
	int PacketSize;
	
	public GroceryDetails(String groceryName, String groceryType, String wholesellerName, double groceryWeight,
			String groceryCategory, String expiryDate, double costPerPacket, int psize) {
		super();
		GroceryName = groceryName;
		GroceryType = groceryType;
		WholesellerName = wholesellerName;
		GroceryWeight = groceryWeight;
		GroceryCategory = groceryCategory;
		ExpiryDate = expiryDate;
		CostPerPacket = costPerPacket;
		PacketSize = psize;
	}

	public String getGroceryName() {
		return GroceryName;
	}

	public void setGroceryName(String groceryName) {
		GroceryName = groceryName;
	}

	public String getGroceryType() {
		return GroceryType;
	}

	public void setGroceryType(String groceryType) {
		GroceryType = groceryType;
	}

	public String getWholesellerName() {
		return WholesellerName;
	}

	public void setWholesellerName(String wholesellerName) {
		WholesellerName = wholesellerName;
	}

	public double getGroceryWeight() {
		return GroceryWeight;
	}

	public void setGroceryWeight(double groceryWeight) {
		GroceryWeight = groceryWeight;
	}

	public String getGroceryCategory() {
		return GroceryCategory;
	}

	public void setGroceryCategory(String groceryCategory) {
		GroceryCategory = groceryCategory;
	}

	public String getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}

	public double getCostPerPacket() {
		return CostPerPacket;
	}

	public void setCostPerPacket(double costPerPacket) {
		CostPerPacket = costPerPacket;
	}

	public int getPacketSize() {
		return PacketSize;
	}

	public void setPacketSize(int packetSize) {
		PacketSize = packetSize;
	}

	@Override
	public String toString() {
		return "GroceryDetails [GroceryName=" + GroceryName + ", GroceryType=" + GroceryType + ", WholesellerName="
				+ WholesellerName + ", GroceryWeight=" + GroceryWeight + ", GroceryCategory=" + GroceryCategory
				+ ", ExpiryDate=" + ExpiryDate + ", CostPerPacket=" + CostPerPacket + ", PacketSize=" + PacketSize
				+ "]";
	}
	
}
