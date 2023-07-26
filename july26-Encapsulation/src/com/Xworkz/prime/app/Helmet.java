package com.Xworkz.prime.app;

public class Helmet {
	private String brand;
	private double price;
	private String shape;
	private String color;
	private String types;
	@Override
		public String toString() { 
			return " brand:"+ this.brand + " price:" + this.price + " shape:" + this.shape +" color:" + this.color + " types:" + this.types;
		}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
}
}
