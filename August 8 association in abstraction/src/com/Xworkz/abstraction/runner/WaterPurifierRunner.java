package com.Xworkz.abstraction.runner;

import com.Xworkz.abstraction.app.waterPurifier.HydraWaterPurifier;
import com.Xworkz.abstraction.app.waterPurifier.Purifing;

public class WaterPurifierRunner {

	public static void main(String[] args) {
System.out.println("Running main in Water Purifier Runner\n");
		
		HydraWaterPurifier purifier = new HydraWaterPurifier();
		
		Purifing purifing = new Purifing(purifier);
		purifing.getPurify();
	}

}
