package com.Xworkz.july13;

public class Resort {
	String name;
	String ownerName="RamaKrishna";
	ResortType type;
	String breakfast;
	Resort(String name)
	{
		this.name=name;
	}
	void resortType(ResortType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.ownerName);
		System.out.println(this.type);
		System.out.println(this.breakfast);
		
	}
}
