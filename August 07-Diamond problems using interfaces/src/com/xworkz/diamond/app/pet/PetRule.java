package com.xworkz.diamond.app.pet;

public interface PetRule {
void getFood();
	
	default void getBath() {
		System.out.println("Giving Bath to pet in Pet Rule");
	}

}
