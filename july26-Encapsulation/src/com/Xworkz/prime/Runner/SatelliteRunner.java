package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		Satellite satellite=new Satellite();
		System.out.println(satellite);
		satellite.setType("Low Earth Orbit");
		satellite.setLatitude(23.456);
		satellite.setShape("Rectangle");
		satellite.setColor("white");
		satellite.setName("Chandrayana 2");
		System.out.println(satellite.toString());
	}

}
