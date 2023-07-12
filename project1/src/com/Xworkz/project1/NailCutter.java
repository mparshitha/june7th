package com.Xworkz.project1;

public class NailCutter {
	static String types;
	String name;
	void displayInstance()
	{
	System.out.println(this.name);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(types);
		return types;
	}
}
