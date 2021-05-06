package com.srm.ABCfruitshop;

import java.util.Date;

public class Fruitdetails {
	
	String FruitName;
	String FruitType;
	String DistributorName;
	double FruitWeight;
	String FruitCategory;
	int Quantity;
	String Location;
	String ExpiryDate;
	double CostPerkg;
	
	public Fruitdetails(String fruitName, String fruitType, String distributorName, double fruitWeight,
			String fruitCategory,int quantity, String location, String expiryDate, Double costPerkg) {
		super();
		FruitName = fruitName;
		FruitType = fruitType;
		DistributorName = distributorName;
		FruitWeight = fruitWeight;
		FruitCategory = fruitCategory;
		Quantity = quantity;
		Location = location;
		ExpiryDate = expiryDate;
		CostPerkg = costPerkg;
	}

	public String getFruitName() {
		return FruitName;
	}

	public void setFruitName(String fruitName) {
		FruitName = fruitName;
	}

	public String getFruitType() {
		return FruitType;
	}

	public void setFruitType(String fruitType) {
		FruitType = fruitType;
	}

	public String getDistributorName() {
		return DistributorName;
	}

	public void setDistributorName(String distributorName) {
		DistributorName = distributorName;
	}

	public String getFruitCategory() {
		return FruitCategory;
	}

	public void setFruitCategory(String fruitCategory) {
		FruitCategory = fruitCategory;
		
	}
	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	
	public double getFruitWeight() {
		return FruitWeight;
	}

	public void setFruitWeight(double fruitWeight) {
		FruitWeight = fruitWeight;
	}

	public String getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}

	public double getCostPerkg() {
		return CostPerkg;
	}

	public void setCostPerkg(double costPerkg) {
		CostPerkg = costPerkg;
	}

	@Override
	public String toString() {
		return "Fruitdetails [FruitName=" + FruitName + ", FruitType=" + FruitType + ", DistributorName="
				+ DistributorName + ", FruitWeight=" + FruitWeight + ", FruitCategory=" + FruitCategory +" ,Quantity="+ Quantity+ ", Location="
				+ Location + ", ExpiryDate=" + ExpiryDate + ", CostPerkg=" + CostPerkg + "]";
	}	

}
