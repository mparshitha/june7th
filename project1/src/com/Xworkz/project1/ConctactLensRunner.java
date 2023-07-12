package com.Xworkz.project1;

public class ConctactLensRunner {

	public static void main(String[] args) {
		System.out.println("Running main in ConctactLensRunner");
		ContactLens ref=new ContactLens();
		ContactLens.shortSightedness=20;
		ref.prize=5000;
		ref.displayInstance();

	}

}
