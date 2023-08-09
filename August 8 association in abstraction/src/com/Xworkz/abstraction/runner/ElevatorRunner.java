package com.Xworkz.abstraction.runner;

import com.Xworkz.abstraction.app.elevator.MallElevator;
import com.Xworkz.abstraction.app.elevator.Shop;

public class ElevatorRunner {

	public static void main(String[] args) {

			System.out.println("Running main in Elevator Runner\n");
			
			MallElevator elevator = new MallElevator();
			
			Shop shop = new Shop(elevator);
			shop.getCarry();
		}
	}


	


