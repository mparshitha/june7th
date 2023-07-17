package com.Xworkz.inheritance;

public class Bangalore extends City{
	Bangalore()
	{
		System.out.println("Invoking no-args const in banglore");
	}
	Bangalore(String cityName,int noOfStreets,int noOfHotels)
	{
		super(cityName,noOfStreets,noOfHotels);
		this.cityName=cityName;
		this.noOfStreets=noOfStreets;
		this.noOfHotels=noOfHotels;
	}
}

