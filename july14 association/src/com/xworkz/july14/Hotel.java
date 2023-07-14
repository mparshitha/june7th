package com.xworkz.july14;

public class Hotel{
String name;
String location="Hassan";
HotelType type;
double prize;
Owner owner=new Owner("Ramakrishna","Kodagu",70,6);
Hotel(String name)
{
	System.out.println("Running String arg in Hotel");
	this.name=name;
}
void hoteltype(HotelType type)
{
	this.type=type;
}
void printInfo()
{
	System.out.println(this.name);
	System.out.println(this.location);
	System.out.println(this.type);
	System.out.println(this.prize);
	this.owner.printInfo();
}
}
