package com.Xworkz.abstraction.runner;

import com.Xworkz.abstraction.app.printingMachine.CanonPrintingMachine;
import com.Xworkz.abstraction.app.printingMachine.Ink;

public class PrintingMachineRunner {

	public static void main(String[] args) {
System.out.println("Running main in Printing machine runner\n");
		
		CanonPrintingMachine machine = new CanonPrintingMachine();
		
		Ink ink = new Ink(machine);
		ink.getPrint();

	}

}
