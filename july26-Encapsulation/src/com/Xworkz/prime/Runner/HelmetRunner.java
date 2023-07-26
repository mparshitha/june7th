package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet=new Helmet();
		System.out.println(helmet);
		helmet.setBrand("AGV");
		helmet.setPrice(550);
		helmet.setShape("Vowel");
		helmet.setColor("RED");
		helmet.setTypes("Angular");
		System.out.println(helmet.toString());

	}

}
