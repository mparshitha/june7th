package com.Xworkz.project1;

public class NailCutterRunner {

	public static void main(String[] args) {
		System.out.println("Running main in NailCutterRunner");
		NailCutter ref=new NailCutter();
		NailCutter.types="Plier,Compound lever,";
		ref.name="Valentine Fogerty";
		ref.displayInstance();
	}

}
