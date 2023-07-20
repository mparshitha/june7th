package com.Xworkz.SuperChaining;

public class Chicken {
	int price;
	String location;
	
	Chicken(int price,String location)
	{
		this.price=price;
		this.location=location;
	}
	void printInfo() {
		System.out.println("price of chicken:" + price);
		System.out.println("location of chicken:"+ location);
	}
}
