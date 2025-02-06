package com.hrex.simplefoodplanner;

import java.time.LocalDate;

import com.hrex.simplefoodplanner.etc.units;

public class Ingreadient{
	private String name;
	private double stockAmount;
	private units unitType;
	private String storageLocation;
	private LocalDate sellBy;
	
	public Ingreadient(String name, double amountStock, units unit, String location, int daysToOff){
		this.name = name;
		this.stockAmount = amountStock;
		this.unitType = unit;
		this.storageLocation = location;
		setSellBy(daysToOff);
	}
	public Ingreadient(String name, double amountStock, units unit, String location, LocalDate dayOff){
		this.name = name;
		this.stockAmount = amountStock;
		this.unitType = unit;
		this.storageLocation = location;
		setSellBy(dayOff);
	}
	
	public void setName(String nName){
		this.name = nName;
	}
	public void setStockAmount(double amountStock){
		this.stockAmount = amountStock;
	}
	public void setUnitType(units unitType){
		this.unitType = unitType;
	}
	public void setStorageLocation(String storageLocation){
		this.storageLocation = storageLocation;
	}
	public void setSellBy(int daysToOff){ //to add days to the sellby
		LocalDate now = LocalDate.now();
		this.sellBy = now.plusDays(daysToOff);
	}
	public void setSellBy(LocalDate date){ //to set the date by date object
		this.sellBy = date;
	}

	public String getName(){
		return(this.name);
	}
	public double getStockAmount(){
		return(this.stockAmount);
	}
	public units getUnit(){
		return(this.unitType);
	}
	public String getLocation(){
		return(this.storageLocation);
	}
	public LocalDate getSellBy(){
		return(this.sellBy);
	}
	
	public String toString(){
		return(name + "," + stockAmount + "," + unitType + "," + storageLocation + "," + sellBy);
	}
}
	

