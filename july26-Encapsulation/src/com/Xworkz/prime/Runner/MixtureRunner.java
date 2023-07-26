package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.Mixture;

public class MixtureRunner {

	public static void main(String[] args) {
		Mixture mixture=new Mixture();
		System.out.println(mixture);
		mixture .setBrand("Haldirams");
		mixture .setPrice(55);
		mixture .setName("Mixture");
		mixture .setColor("Yellow");
		mixture .setTypes(4);
		System.out.println(mixture.toString());

	}

}
