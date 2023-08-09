package com.Xworkz.abstraction.app.printingMachine;

public class Ink {
private PrintingMachine machine;
	
	public Ink(PrintingMachine machine) {
		this.machine = machine;
	}

	
	public void getPrint() {
		if(machine!=null) {
			System.out.println("Machine is not null,can print");
			this.machine.print();
		}
		else {
			System.err.println("machine is null,cannot print");
		}
	}
}
