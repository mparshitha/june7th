package com.Xworkz.inheritance;

public class Monkey extends Animal {
	Monkey()
	{
		System.out.println("Invoking no-args const in Monkey");
	}
	Monkey(String name, String color, String food)
	{
		super(name,color,food);
		this.name=name;
		this.color=color;
		this.food=food;
	}
}
