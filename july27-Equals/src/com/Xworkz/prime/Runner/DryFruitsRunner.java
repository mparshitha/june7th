package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.DryFruits;

public class DryFruitsRunner {

	public static void main(String[] args) {
System.out.println("Running main in DryFruitsRunner");
		DryFruits dryFruits = new DryFruits("Pista", "Suma stores", "online", 240, 250, 15);
		DryFruits dryFruits2 = new DryFruits("Pista", "Suma stores", "online", 240, 250, 15);
		boolean result = dryFruits.equals(dryFruits2);
		System.out.println("The DryFruits are same: " + result);
	}

}
