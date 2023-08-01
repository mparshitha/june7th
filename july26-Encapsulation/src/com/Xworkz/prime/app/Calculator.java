package com.Xworkz.prime.app;

public class Calculator {
	private String name;
	private double price;
	private String shape;
	private String color;
	private int types;

	@Override
	public String toString() {
		return " name:" + this.name + " price:" + this.price + " shape:" + this.shape + " color:" + this.color
				+ " types:" + this.types;
	}

	public int getTypes() {
		return types;
	}

	public void setTypes(int types) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
