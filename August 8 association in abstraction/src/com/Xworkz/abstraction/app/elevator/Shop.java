package com.Xworkz.abstraction.app.elevator;

public class Shop {
private Elevator elevator;
	
	public Shop(Elevator elevator) {
		this.elevator = elevator;
	}

	public void getCarry() {
		if(elevator!=null) {
			System.out.println("Elevator is not null,can carryLaguage");
			this.elevator.carryLaguage();
		}
		else {
			System.err.println("Elevator is null, cannot carryLaguage");
		}
}
}
