package com.xworkz.crudoperation.runner;

import com.xworkz.crudoperation.app.Apartment.ApartmentShree;
import com.xworkz.crudoperation.app.Apartment.ApartmentShreeImpl;
public class ApartmentRunner {

	public static void main(String[] args) {
System.out.println("Running main in Apartment Runner\n");
		
		ApartmentShree shree = new ApartmentShreeImpl();
		shree.save("Nice Homes");
		shree.save("Royal Homes");
		shree.save("Simple Homes");
		shree.save("Palace Homes");
		shree.save("Ideal Homes");
		
		System.out.println("--------------------");
		
		shree.display();



	}

}
