package com.Xworkz.abstraction.app.laptop;

public class Cleaner {
	private Laptop laptop;
	 
	public Cleaner( Laptop laptop) {
		this.laptop = laptop;
	}

	public void getDisplay() {
		if(laptop!=null) {
			System.out.println("Laptop is not null");
			this.laptop.display();
			
		}
		else {
			System.err.println("laptop is null, cannot display");
		}
	}

}

