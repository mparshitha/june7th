package com.Xworkz.prime.app;

public class NewsPaper {
	private int brand;
	private double price;
	private String name;
	private int types;
	private int noOfPages;
	@Override
		public String toString() { 
			return " brand:"+ this.brand + " price:" + this.price + " name:" + this.name +" types:" + this.types + " types:" + this.types;
		}
	public int getTypes() {
		return types;
	}
	public void setTypes(int types) {
		this.types = types;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getnoOfPages() {
		return noOfPages;
	}
	public void setnoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
}
}
