package com.Xworkz.project1;

public class FabricRunner {

	public static void main(String[] args) {
		System.out.println("Running main in FabricRunner");
		Fabric ref=new Fabric();
		Fabric.type="Chiffon";
		ref.brand="Sundrella";
		ref.displayInstance();
	}

}
