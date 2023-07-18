package com.Xworkz.july18;

public class Shoe {
	double price;
	ShoeColor color;
	ShoeSize size;
	
	public Shoe(double price, ShoeColor color, ShoeSize size) {
		System.out.println("ivoking arg const of Shoe");
		this.price=price;
		this.color=color;
		this.size=size;
	}
}
