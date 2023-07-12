package com.Xworkz.project1;

public class Rope {
	static String types;
	int length;
	void displayInstance()
	{
	System.out.println(this.length);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(types);
		return types;
	}
}
