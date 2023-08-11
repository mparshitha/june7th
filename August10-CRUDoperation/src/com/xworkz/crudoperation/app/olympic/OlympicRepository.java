package com.xworkz.crudoperation.app.olympic;

public interface OlympicRepository {
int TOTAL = 5;
	
	void save(int year, String country);
	
	void display();
}
