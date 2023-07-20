package com.Xworkz.SuperChaining;

public class FarmChicken extends Chicken{
	int noOfDays;
	String careTaker;
	
	
	public FarmChicken(int price, String location, int noOfDays, String careTaker) {
		super(price, location);
		this.noOfDays = noOfDays;
		this.careTaker = careTaker;
	}
	void printInfo() {
		super.printInfo();
		System.out.println("the number of days:"+noOfDays);
		System.out.println("the take carer:" +careTaker);
	}
	
}
