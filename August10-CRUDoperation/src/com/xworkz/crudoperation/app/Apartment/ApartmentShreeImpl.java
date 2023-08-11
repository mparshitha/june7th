package com.xworkz.crudoperation.app.Apartment;

public class ApartmentShreeImpl implements ApartmentShree {

	private String[] names = new String[Total_COUNT];

	private int index = 0;

	@Override
	public void save(String name) {
		if(index < Total_COUNT) {
			this.names[index] = name;
			System.out.println("Name saved at index " + index + " is " + name);
			index = index + 1;
			System.out.println("Updated index is " + index);
			
		}
		else {
			System.err.println("Index limit exceeded, cannot save more names");
		}
	}

	@Override
	public void display() {
		for(int start=0; start<Total_COUNT; start++) {
			System.out.println("Name at index " + start + " is "  + names[start]);
		}
		
	}
	

}
