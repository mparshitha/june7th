package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		Grinder grinder=new Grinder();
		System.out.println(grinder);
		grinder.setName("BENCH");
		grinder.setPrice(3250);
		grinder.setShape("Cylindrical");
		grinder.setColor("RED");
		grinder.setTypes("Angle Grinder");
		System.out.println(grinder.toString());
	}

}
