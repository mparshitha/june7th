package com.Xworkz.project1;

public class Printer {
	static String name;
	String brand;
	void displayInstance()
	{
	System.out.println(this.brand);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(name);
		return name;
	}
}
