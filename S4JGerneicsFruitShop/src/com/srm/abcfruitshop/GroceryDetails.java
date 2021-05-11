package com.srm.abcfruitshop;



public class GroceryDetails {

	String groceryName;
	String groceryType;
	String wholesellerName;
	double groceryWeight;
	String groceryCategory;
	String expiryDate;
	double costPerPacket;
	int packetSize;
	
	public GroceryDetails(String groceryName, String groceryType, String wholesellerName, double groceryWeight,
			String groceryCategory, String expiryDate, double costPerPacket, int psize) {
		super();
		this.groceryName=groceryName;
		this.groceryType=groceryType;
		this.wholesellerName=wholesellerName;
		this.groceryWeight=groceryWeight;
		this.groceryCategory=groceryCategory;
		this.expiryDate=expiryDate;
		this.costPerPacket=costPerPacket;
	}

	public String getGroceryName() {
		return groceryName;
	}

	public void setGroceryName(String groceryName) {
		//do nothing
	}

	public String getGroceryType() {
		return groceryType;
	}

	public void setGroceryType(String groceryType) {
		//do nothing
	}

	public String getWholesellerName() {
		return wholesellerName;
	}

	public void setWholesellerName(String wholesellerName) {
		//do nothing
	}

	public double getGroceryWeight() {
		return groceryWeight;
	}

	public void setGroceryWeight(double groceryWeight) {
		//do nothing
	}

	public String getGroceryCategory() {
		return groceryCategory;
	}

	public void setGroceryCategory(String groceryCategory) {
		//do nothing
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		//do nothing
	}

	public double getCostPerPacket() {
		return costPerPacket;
	}

	public void setCostPerPacket(double costPerPacket) {
		//do nothing
	}

	public int getPacketSize() {
		return packetSize;
	}

	public void setPacketSize(int packetSize) {
		//do nothing
	}

	@Override
	public String toString() {
		return "GroceryDetails [GroceryName=" + groceryName + ", GroceryType=" + groceryType + ", WholesellerName="
				+ wholesellerName + ", GroceryWeight=" + groceryWeight + ", GroceryCategory=" + groceryCategory
				+ ", ExpiryDate=" + expiryDate + ", CostPerPacket=" + costPerPacket + ", PacketSize=" + packetSize
				+ "]";
	}
	
}
