package com.Xworkz.project1;

public class ContactLens {
	static int shortSightedness;
	double prize;
	void displayInstance()
	{
	System.out.println(this.prize);
	displaystatic();
	}
	static int displaystatic() {
		System.out.println(shortSightedness);
		return shortSightedness;
	}

}
