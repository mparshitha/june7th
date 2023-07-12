package com.Xworkz.project1;

public class CoastalRunner {

	public static void main(String[] args) {
		System.out.println("Running main in SubmarineRunner");
		Coastal ref=new Coastal();
		Coastal.synonym="Marshey,Seaside,Littoral";
		ref.types="Weathering,transportation,deposition";
		ref.displayInstance();
	}

}
