package com.Xworkz.inheritance;

public class Animal {
	String name;
	String color;
	String food;
	Animal()
	{
		System.out.println("Invoking no-args const in Animal");
	}
	Animal(String name,String color,String food)
	{
		this.name=name;
		this.color=color;
		this.food=food;
	}
	void printInfo()
	{
		System.out.println("Animal Name="+this.name);
		System.out.println("Animal color ="+this.color);
		System.out.println("Which food="+this.food);
	}
}
