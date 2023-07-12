package com.Xworkz.project1;

public class SubmarineRunner {

	public static void main(String[] args) {
		System.out.println("Running main in SubmarineRunner");
		Submarine ref=new Submarine();
		Submarine.usage="To travel deep under the occean";
		ref.inventor="John Philip Holland";
		ref.displayInstance();
	}

}
