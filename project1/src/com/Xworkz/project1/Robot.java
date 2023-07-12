package com.Xworkz.project1;

public class Robot {
	static String types;
	String usage;
	void displayInstance()
	{
	System.out.println(this.usage);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(types);
		return types;
	}
}
