package com.Xworkz.inheritance;

public class City {
	String cityName;
	int noOfStreets;
	int noOfHotels;
	City()
	{
		System.out.println("Invoking no-args const in city");
	}
	City(String cityName,int noOfStreets,int noOfHotels)
	{
		this.cityName=cityName;
		this.noOfStreets=noOfStreets;
		this.noOfHotels=noOfHotels;
	}
	void printInfo()
	{
		System.out.println("City name="+this.cityName);
		System.out.println("No of places="+this.noOfStreets);
		System.out.println("Famous for="+this.noOfHotels);
	
}
}
