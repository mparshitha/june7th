package com.Xworkz.project1;

public class Coastal {
	static String synonym;
	String types;
	void displayInstance()
	{
	System.out.println(this.types);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(synonym);
		return synonym;
	}
}
