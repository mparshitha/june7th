package com.Xworkz.abstraction.runner;

import com.Xworkz.abstraction.app.washingMachine.DryType;
import com.Xworkz.abstraction.app.washingMachine.SamsungWashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
System.out.println("Running main in Washing machine runner\n");
		
		SamsungWashingMachine machine = new SamsungWashingMachine();
		
		DryType drytype = new DryType(machine);
		drytype.getDry();

	}

}
