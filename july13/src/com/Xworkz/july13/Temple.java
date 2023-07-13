package com.Xworkz.july13;

public class Temple {
	String name;
	String timings="8.30";
	TempleType type;
	String location;
	Temple(String name)
	{
		this.name=name;
	}
	void templeType(TempleType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.timings);
		System.out.println(this.type);
		System.out.println(this.location);
		
	}
}
