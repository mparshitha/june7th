package com.Xworkz.prime.Runner;
import com.Xworkz.prime.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("Running main in VehicleRunner");
		Vehicle vehicle=new Vehicle("Arena",5,"White",2023,"MaruthiSuzuki" );
		Vehicle vehicle2=new Vehicle("Ertiga",12, "Gray",2020,"MaruthiSuzuki");
		boolean result=vehicle.equals(vehicle2);
		System.out.println("Vehicle is same :"+ result);

	}

}
