package com.Xworkz.july13;

public class Battery {
	String name;
	String color="White";
	BatteryType type;
	int price;
	Battery(String name)
	{
		this.name=name;
	}
	void batteryType(BatteryType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.type);
		System.out.println(this.price);
		
	}
}