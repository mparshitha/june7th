package com.Xworkz.july13;

public class ResortRunner {

	public static void main(String[] args) {
		Resort ref=new Resort("Royal Villa");
		ref.resortType(ResortType.Historic);
		ref.breakfast="Pancakes";
		ref.display();
		
		Resort ref1=new Resort("Palm Meadows");
		ref1.resortType(ResortType.Golf);
		ref1.breakfast="Waffles";
		ref1.display();

	}

}
