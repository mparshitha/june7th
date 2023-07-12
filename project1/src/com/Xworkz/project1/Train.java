package com.Xworkz.project1;

public class Train {
	static String name;
	int number;
	void displayInstance()
	{
	System.out.println(this.number);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(name);
		return name;
	}
}
