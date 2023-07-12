package com.Xworkz.project1;

public class SIMCard {
	static String name;
	String types;
	void displayInstance()
	{
	System.out.println(this.types);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(name);
		return name;
	}
}
