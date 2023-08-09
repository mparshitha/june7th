package com.Xworkz.abstraction.app.washingMachine;

public class DryType {
private WashingMachine machine;
	
	public DryType(WashingMachine machine) {
	this.machine = machine;
	}
	
	public void getDry() {
		if(machine!= null) {
			System.out.println("Machine is not null,can dry");
			this.machine.dry();
		}
		else {
			System.err.println("machine is null,cannot dry");
		}
	}
	
}
