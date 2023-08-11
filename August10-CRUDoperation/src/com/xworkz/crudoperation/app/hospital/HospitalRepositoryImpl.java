package com.xworkz.crudoperation.app.hospital;

public class HospitalRepositoryImpl implements HospitalRepository {
private String[] names = new String[TOTAL_NUMBER];
	
	private int index = 0;

	public void save(String name) {
		
		if(index < TOTAL_NUMBER) {
			this.names[index] = name;
			System.out.println("Name saved at index " + index + "is " + name);
			index = index +1;
			System.out.println("Updated index is " + index);
		}
		else {
			System.err.println("Index limit exceeded, cannot save more names");
		}
	}

	public void display() {
		for(int start=0; start<TOTAL_NUMBER; start++) {
			System.out.println("Name at index " + start + " is " + names[start] );
		}
		
	}

}
