package com.Xworkz.prime.app;

public class Vehicle {
	private String name;
	private double price;
	private String color;
	private double model;
	private String brandName;
	
	public Vehicle(String name,double price, String color, double model, String brandName) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.model = model;
		this.brandName = brandName;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getModel() {
		return model;
	}
	public String getBrandName() {
		return brandName;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return " Name:"+this.name + " Price:"+this.price + " Color:"+this.color +" Model:"+this.model +" BrandName:"+this.brandName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!= null) {
			System.out.println("Argument is not null, can compare ");
			if (obj instanceof Vehicle){
			  Vehicle casted = (Vehicle)obj;
				if( this.name == casted.name &&this.model == casted.model && this.color == casted.color &&
					this.brandName == casted.brandName  && this.price == casted.price) {
				System.out.println("Both are same");
				return true;
			}
			else 
			{
				System.err.println("Both are not same");
			}
			}
		else {
			System.err.println("Argument is null,cannot compare");
		}
		}
		return false;
}
}
