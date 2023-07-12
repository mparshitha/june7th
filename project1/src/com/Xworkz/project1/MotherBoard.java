package com.Xworkz.project1;

public class MotherBoard {
	static String types;
	double highestPrize;
	void displayInstance()
	{
	System.out.println(this.highestPrize);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(types);
		return types;
	}
}
