package com.Xworkz.project1;

public class Submarine {
	static String usage;
	String inventor;
	void displayInstance()
	{
	System.out.println(this.inventor);
	displaystatic();
	}
	static String displaystatic() {
		System.out.println(usage);
		return usage;
	}
}
