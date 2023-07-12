package com.Xworkz.project1;

public class PrinterRunner {

	public static void main(String[] args) {
		System.out.println("Running main in MotherBoardRunner");
		Printer ref=new Printer();
		Printer.name="Laser Printers";
		ref.brand="Epson";
		ref.displayInstance();

	}

}
