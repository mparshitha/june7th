package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.Tap;

public class TapRunner {

	public static void main(String[] args) {
		Tap tap=new Tap();
		System.out.println(tap);
		tap .setBrand("Jaguar");
		tap .setPrice(250);
		tap .setName("Monobloc");
		tap .setColor("silver");
		tap .setTypes(10);
		System.out.println(tap.toString());


	}

}
