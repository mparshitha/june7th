package com.Xworkz.abstraction.runner;

import com.Xworkz.abstraction.app.laptop.Cleaner;
import com.Xworkz.abstraction.app.laptop.HpLaptop;

public class LaptopRunner {

	public static void main(String[] args) {
System.out.println("Running main in Laptop Runner\n");
		
		HpLaptop laptop =  new HpLaptop();	
	
		Cleaner cleaner =  new Cleaner(laptop);
		cleaner.getDisplay();
	}

}
