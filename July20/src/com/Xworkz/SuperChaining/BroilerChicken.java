package com.Xworkz.SuperChaining;

public class BroilerChicken extends Chicken {
	boolean alive;
	double weight;
	
	public BroilerChicken(int price, String location, boolean alive, double weight) {
		super(price, location);
		this.alive = alive;
		this.weight = weight;
	}
	
	
   void printInfo() {
		super.printInfo();
		System.out.println("It is alive:" + alive);
		System.out.println("The weightof chicken is:"+ weight);
		
	}

}
