package com.Xworkz.july13;

public class Theater {
	String name;
	String movie="Adhipurush";
	TheaterType type;
	int ticketprice;
	Theater(String name)
	{
		this.name=name;
	}
	void theaterType(TheaterType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.movie);
		System.out.println(this.type);
		System.out.println(this.ticketprice);
		
	}
}
