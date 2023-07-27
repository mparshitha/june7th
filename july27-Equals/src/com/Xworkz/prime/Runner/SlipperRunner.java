package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
     System.out.println("Running main in SlipperRunner");
		Slipper slipper = new Slipper("ADIDAS", "adidas boston ", 6, 1200, "black", "Bata", true);		
		Slipper slipper2 = new Slipper("Sparx", "sparx Sfg-83", 8, 750, "grey", "Bata", false);
		boolean result = slipper.equals(slipper2);
		System.out.println("The slippers are same : " + result);
	}

}
