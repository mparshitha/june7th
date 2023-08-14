package com.xworkz.crudoperation.app.politician;

import org.w3c.dom.Text;

public class PoliticianRepositryImpl implements PoliticianRepositry {

	private String[] names = new String[TOTAL_NUMBER];

	private int index = 0;

	@Override
	public void save(String name) {
		if (index < TOTAL_NUMBER) {
			System.out.println("Save is running in Politician Repository Impl...");
			this.names[index] = name;
			System.out.println("At  index " + index + " name is " + name);
			index = index + 1;
			System.out.println("Updated index is " + index);
		} else {
			System.err.println("Index limit exceeded, Cannot save more names");
		}

	}

	@Override
	public void display() {
		System.out.println("Display is running in Politician Repository Impl...");

		for (int start = 0; start < TOTAL_NUMBER; start++) {
			System.out.println("The names at index " + start + " is " + names[start]);
		}
	}
	@Override
	public String[] findStartswith(String name) {
		String[] temp = new java.lang.String[TOTAL_NUMBER];
		int tempIndex = 0;
		for (int pos = 0; pos < names.length; pos++) {
			String ref = names[pos];
			if (ref.startsWith(name)) {
				temp[tempIndex]="0";
				tempIndex++;
				return temp;
			}

		}
		return temp;
	}

}
