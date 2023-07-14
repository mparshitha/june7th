package com.Xworkz.july13;

public class Bottle {
	String name;
	String color="Black";
	BottleType type;
	double prize;
	BottleCompany bottlecompany=new BottleCompany("adfh","Nathaniel Wyeth's",10,2);
	Bottle(String name)
	{
		System.out.println("Running no-arg const of Bottle");
		this.name=name;
	}
	void bottleType(BottleType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.type);
		System.out.println(this.prize);
		this.bottlecompany.display();
	}
}
