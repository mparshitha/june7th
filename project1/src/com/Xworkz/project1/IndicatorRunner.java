package com.Xworkz.project1;

public class IndicatorRunner {

	public static void main(String[] args) {
		System.out.println("Running main in IndicatorRunner");
		Indicator ref=new Indicator();
		Indicator.types="RedLitmus";
		ref.prize=3000;
		ref.displayInstance();
	}

}
