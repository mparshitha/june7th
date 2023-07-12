package com.Xworkz.project1;

public class NumberPlate {
	static String number;
	String color;
	void displayInstance()
	{
	System.out.println(this.color);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(number);
		return number;
	}
}
