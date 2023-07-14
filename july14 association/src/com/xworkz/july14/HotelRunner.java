package com.xworkz.july14;

public class HotelRunner {
public static void main(String[] args)
{
	System.out.println("Running main in HotelRunner");
	Hotel hotel=new Hotel("Rama");
	hotel.hoteltype (HotelType.RYOKAN);
	hotel.prize=1000;
	hotel.printInfo();
}
}
