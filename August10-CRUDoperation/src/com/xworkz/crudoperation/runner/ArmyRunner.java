package com.xworkz.crudoperation.runner;
import com.xworkz.crudoperation.app.army.ArmyIndia;
import com.xworkz.crudoperation.app.army.ArmyIndiaImpl;
public class ArmyRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Army Runner\n");

		ArmyIndia india = new ArmyIndiaImpl();
		
		india.save("Roadrunners");
		india.save("Night Train");
		india.save("Demons");
		india.save("Dawgs");
		india.save("Wolf-pack");
		
		System.out.println("***************************");
		
		india.display();

	}

}
