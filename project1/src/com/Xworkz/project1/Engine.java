package com.Xworkz.project1;

public class Engine {
	static int weight;
	double prize;
	void displayInstance()
	{
	System.out.println(this.prize);
	displaystatic();
	}
	static int displaystatic() {
		System.out.println(weight);
		return weight;
	}
}
