package com.Xworkz.Runner;

import com.Xworkz.implementation.AirRocket;
import com.Xworkz.implementation.SpaceRocket;

public class RocketRunner {

	public static void main(String[] args) {
		SpaceRocket spaceRocket = new SpaceRocket();
		spaceRocket.launch();
		spaceRocket.land();
		spaceRocket.deploySatellite();

		AirRocket airRocket = new AirRocket();
		airRocket.launch();
		airRocket.land();
		

	}

}
