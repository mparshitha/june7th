package com.xworkz.crudoperation.app.politician;

public interface PoliticianRepositry {
	int TOTAL_NUMBER = 5;
	String[] String = null;

	void save(String name);

	void display();

	default String[] findStartswith(String name) {
		return String;
	}

}
