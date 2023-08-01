package com.Xworkz.Runner;

import com.Xworkz.implementation.Accessories;
import com.Xworkz.implementation.Clothing;

public class FashionRunner {

	public static void main(String[] args) {
		Clothing shirt = new Clothing();
		shirt.display();
		shirt.buy();
		shirt.wear();

		Accessories bag = new Accessories();
		bag.display();
		bag.buy();
	}

}
