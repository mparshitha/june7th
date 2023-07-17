package com.Xworkz.inheritance;

public class Home extends Building {
	Home()
	{
		super();
		System.out.println("Invoking no-args const in Home");
	}
	Home(String color,int noOfFloors,String type)
	{
		super(color,type,noOfFloors);
		this.color=color;
		this.noOfFloors=noOfFloors;
		this.type=type;
	}
}
