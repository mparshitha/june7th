package com.Xworkz.Runner;

import com.Xworkz.implementation.BagPack;
import com.Xworkz.implementation.HandBag;

public class BagRunner {

	public static void main(String[] args) {
			HandBag purse = new HandBag();
			purse.display();
			purse.open();
			purse.carry();

			BagPack schoolBag = new BagPack();
			schoolBag.display();
			schoolBag.open();
		

	}

}
