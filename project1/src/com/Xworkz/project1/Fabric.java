package com.Xworkz.project1;

public class Fabric {
	static String type;
	String brand;
	void displayInstance()
	{
	System.out.println(this.brand);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(type);
		return type;
	}

}
