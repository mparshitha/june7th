package com.Xworkz.abstraction.app.waterPurifier;

public class Purifing {
	private WaterPurifier purifier;

	public Purifing(WaterPurifier purifier) {
		this.purifier = purifier;
	}
	
	public void getPurify() {
		if(purifier!=null) {
			System.out.println("Purify is not null");
			this.purifier.purify();
		}
		else {
			System.err.println("Purify is null, cannot purify");
		}
	}
	
}
