package com.hrex.simplefoodplanner;
public class Ingreadient {
	private String name;
	private double stockAmount;
	
	public Ingreadient(String name, double amountStock){
		this.name = name;
		this.stockAmount = amountStock;
	}
	
	public void setName(String nName) {
		this.name = nName;
	}
	public void setStockAmount(double amountStock) {
		this.stockAmount = amountStock;
	}
	
	public String getName() {
		return(this.name);
	}
	public double getStockAmount() {
		return(this.stockAmount);
	}
	
	public String toString() {
		return(name + "," + stockAmount);
	}
}
	

