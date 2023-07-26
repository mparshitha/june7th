package com.Xworkz.prime.app;

public class Tap {
	private String brand;
	private double price;
	private String name;
	private String color;
	private int types;
	@Override
		public String toString() { 
			return " brand:"+ this.brand + " price:" + this.price + " name:" + this.name +" color:" + this.color + " types:" + this.types;
		}
	public int getTypes() {
		return types;
	}
	public void setTypes(int types) {
		this.types = types;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
}
}
