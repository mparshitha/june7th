package com.Xworkz.project1;

public class TV {
	static String brand;
	double prize;
	void displayInstance()
	{
	System.out.println(this.prize);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(brand);
		return brand;
	}
}
