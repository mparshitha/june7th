package com.Xworkz.abstraction.runner;

import com.Xworkz.abstraction.app.smartWatch.Boxing;
import com.Xworkz.abstraction.app.smartWatch.NoiseSmartWatch;

public class SmartWatchRunner {

	public static void main(String[] args) {
System.out.println("Running main in Smart watch Runner\n");
		
		NoiseSmartWatch smartWatch = new NoiseSmartWatch();
		
		Boxing boxing = new Boxing(smartWatch);
		boxing.getShowTime();
	}

}
