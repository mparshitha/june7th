package com.Xworkz.project1;

public class Indicator {
	static String types;
	double prize;
	void displayInstance()
	{
	System.out.println(this.prize);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(types);
		return types;
	}
}
