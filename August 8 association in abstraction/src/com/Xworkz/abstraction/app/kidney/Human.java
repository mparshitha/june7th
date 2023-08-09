package com.Xworkz.abstraction.app.kidney;

public class Human {
private Kidney kidney;
	
	public Human(Kidney kidney) {
		this.kidney = kidney;
		System.out.println("Kidney arguement constructor of Human");
	}

	public void getSize() {
		if(kidney!=null) {
			System.out.println("kidney is not null");
			this.kidney.size();
		}
		else {
			System.err.println("Kidney is null");
		}
	}
}
