package com.srm.abcfruitshop;



public class Fruitdetails {
	
	String fruitName;
	String fruitType;
	String distributorName;
	double fruitWeight;
	String fruitCategory;
	int quantity;
	String location;
	String expiryDate;
	double costPerkg;
	
	public Fruitdetails(String fruitName, String fruitType, String distributorName, double fruitWeight,
			String fruitCategory,int quantity, String location, String expiryDate, Double costPerkg) {
		super();
		this.fruitName=fruitName;
		this.fruitType=fruitType;
		this.distributorName=distributorName;
		this.fruitWeight=fruitWeight;
		this.fruitCategory=fruitCategory;
		this.quantity=quantity;
		this.location=location;
		this.expiryDate=expiryDate;
		this.costPerkg=costPerkg;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		//do nothing
	}

	public String getFruitType() {
		return fruitType;
	}

	public void setFruitType(String fruitType) {
		//do nothing
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		//do nothing
	}

	public String getFruitCategory() {
		return fruitCategory;
	}

	public void setFruitCategory(String fruitCategory) {
		
		//do nothing
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		//do nothing
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		//do nothing
	}

	
	public double getFruitWeight() {
		return fruitWeight;
	}

	public void setFruitWeight(double fruitWeight) {
		//do nothing
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		//do nothing
	}

	public double getCostPerkg() {
		return costPerkg;
	}

	public void setCostPerkg(double costPerkg) {
		//do nothing
	}

	@Override
	public String toString() {
		return "Fruitdetails [FruitName=" + fruitName + ", FruitType=" + fruitName + ", DistributorName="
				+ distributorName + ", FruitWeight=" + fruitWeight + ", FruitCategory=" + fruitCategory +" ,Quantity="+ quantity+ ", Location="
				+ location + ", ExpiryDate=" + expiryDate + ", CostPerkg=" + costPerkg + "]";
	}	

}
