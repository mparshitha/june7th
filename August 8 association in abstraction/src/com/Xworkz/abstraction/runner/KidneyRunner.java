package com.Xworkz.abstraction.runner;

import com.Xworkz.abstraction.app.kidney.Human;
import com.Xworkz.abstraction.app.kidney.HumanKidney;
import com.Xworkz.abstraction.app.kidney.Kidney;

public class KidneyRunner {

	public static void main(String[] args) {
System.out.println("Runnin main in Kidney Runner\n");
		
		
		Kidney kid = new HumanKidney();
		
		Human human = new Human(kid);
		human.getSize();

	}

}
