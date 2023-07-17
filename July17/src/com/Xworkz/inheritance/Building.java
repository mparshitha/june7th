package com.Xworkz.inheritance;

public class Building {
	String color;
	int noOfFloors;
	String type;
	Building()
	{
		System.out.println("Invoking no-args const in Building");
	}
	Building(String type,String color, int noOfFloors)
	{
		this.type=type;
		this.noOfFloors=noOfFloors;
		this.color=color;
	}
	void printInfo()
	{
		System.out.println("Type of building="+this.type);
		System.out.println("Floors of building="+this.noOfFloors);
		System.out.println("Color of building="+this.color);
	}


}
