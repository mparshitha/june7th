package com.Xworkz.july13;

public class BottleRunner {

	public static void main(String[] args) {
		Bottle ref=new Bottle("Tupperware");
		ref.bottleType(BottleType.Glass);
		ref.prize=540;
		ref.display();
		
		Bottle ref1=new Bottle("Magnum");
		ref1.bottleType(BottleType.Copper);
		ref1.prize=800;
		ref1.display();

	}

}
